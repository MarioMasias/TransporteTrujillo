package com.udemy.backendninja.Service;

import java.util.List;

import com.udemy.backendninja.Entity.RegistroAveria;
import com.udemy.backendninja.Service.ModelForm.NotificarForm;
import com.udemy.backendninja.Service.ModelForm.PendienteForm;

public interface RegistroAveriaService {
	public abstract List<RegistroAveria> listAllRegistroAveria();
	public abstract RegistroAveria addRegistroAveria(RegistroAveria Registroaveria);
	public abstract RegistroAveria addRegistroTodo(NotificarForm notificar);
	public abstract List<PendienteForm> MostrarPendiente();

}
