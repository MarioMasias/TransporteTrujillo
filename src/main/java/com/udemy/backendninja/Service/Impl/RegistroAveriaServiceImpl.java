package com.udemy.backendninja.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.backendninja.Entity.Averia;
import com.udemy.backendninja.Entity.Conductor;
import com.udemy.backendninja.Entity.RegistroAveria;
import com.udemy.backendninja.Repository.RegistroAveriaJPARepository;
import com.udemy.backendninja.Service.AveriaService;
import com.udemy.backendninja.Service.ConductorService;
import com.udemy.backendninja.Service.RegistroAveriaService;
import com.udemy.backendninja.Service.ModelForm.NotificarForm;

@Service("RegistroAveriaService")
public class RegistroAveriaServiceImpl implements RegistroAveriaService{
	@Autowired
	@Qualifier ("registroaveriaJPARespository")
	private RegistroAveriaJPARepository ra;
	@Autowired
	@Qualifier ("ConductorService")
	private ConductorService conductorS;
	@Autowired
	@Qualifier ("AveriaService")
	private AveriaService averiaS;

	@Override
	public List<RegistroAveria> listAllRegistroAveria() {
		// TODO Auto-generated method stub
		return ra.findAll();
	}

	@Override
	public RegistroAveria addRegistroAveria(RegistroAveria Registroaveria) {
		// TODO Auto-generated method stub
		return ra.save(Registroaveria);
	}

	@Override
	public RegistroAveria addRegistroTodo(NotificarForm notificar) {
		Conductor cond1= new Conductor();
		Conductor cond2= new Conductor();
		RegistroAveria Reg= new RegistroAveria();
		cond1.setNombre(notificar.getNombre());
		cond1.setApellido(notificar.getApellido());
		cond2=conductorS.addConductor(cond1);
		
		Averia aver1= new Averia();
		Averia aver2= new Averia();
		aver1.setNombre_averia(notificar.getAveria());
		aver1.setGrado_averia(notificar.getGradoaveria());
		aver2=averiaS.addAveria(aver1);
		
		Reg.setId_conductor(cond2.getId_conductor());
		Reg.setId_bus(notificar.getId_bus());
		Reg.setDetalle_averia(notificar.getDetalle_averia());
		Reg.setFecha_registro(notificar.getFecha_registro());
		Reg.setId_averia(aver2.getId_averia());
		// TODO Auto-generated method stub
		return ra.save(Reg);
	}

}
