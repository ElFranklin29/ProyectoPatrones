
package Logica;


import java.util.ArrayList;
import java.util.List;


public class ControladoraLogica {
    private List<EncuestaDiariaVO> encuestasDiarias= new ArrayList<>();
  
    public void registrarEncuestaDiaria(EncuestaDiariaVO encuestaDiaria){      
      encuestasDiarias.add(encuestaDiaria);
    }

    public List<EncuestaDiariaVO> getEncuestasDiarias() {
        return encuestasDiarias;
    }
    
    
}
