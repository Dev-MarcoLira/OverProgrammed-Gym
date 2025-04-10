package br.cefet;

public class Appointment {
    
    private String dataAgendada;

    public Appointment(
        String dataAgendada
    ){
        setDataAgendada(dataAgendada);
    }
    
    public String getDataAgendada() {
        return this.dataAgendada;
    }

    public void setDataAgendada(String dataAgendada) {
        this.dataAgendada = dataAgendada;
    }


}
