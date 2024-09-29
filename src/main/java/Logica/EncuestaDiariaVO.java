package Logica;

public class EncuestaDiariaVO {

    private String estadoAnimo;
    private String nivelEnergia;
    private String estresAnsiedad;
    private String balanceGeneral;
    private String recomendacion;

    public EncuestaDiariaVO() {
    }

    public EncuestaDiariaVO(String estadoAnimo, String nivelEnergia, String estresAnsiedad, String balanceGeneral, String recomendacion) {
        this.estadoAnimo = estadoAnimo;
        this.nivelEnergia = nivelEnergia;
        this.estresAnsiedad = estresAnsiedad;
        this.balanceGeneral = balanceGeneral;
        this.recomendacion = recomendacion;
    }

    public String getEstadoAnimo() {
        return estadoAnimo;
    }

    public void setEstadoAnimo(String estadoAnimo) {
        this.estadoAnimo = estadoAnimo;
    }

    public String getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(String nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    public String getEstresAnsiedad() {
        return estresAnsiedad;
    }

    public void setEstresAnsiedad(String estresAnsiedad) {
        this.estresAnsiedad = estresAnsiedad;
    }

    public String getBalanceGeneral() {
        return balanceGeneral;
    }

    public void setBalanceGeneral(String balanceGeneral) {
        this.balanceGeneral = balanceGeneral;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }

    /*En este metodo se encuentran todas las posibles combinaciones de respuestas que el paciente
    puede realizar, que de acuerdo a la combinacion, se le asignara un resultado o balance*/
    public void combinatoriaRespuestas() {
        
        //BUENO
        //Bueno - Alta
        if (estadoAnimo.equals("Bueno") && nivelEnergia.equals("Alta")
                && estresAnsiedad.equals("Todo el dia")) {
            balanceGeneral = "Hoy te sientes generalmente bien y tienes mucha energía para realizar tus actividades. Sin embargo, has estado experimentando ansiedad de manera constante durante todo el día. Aunque tu estado de ánimo es positivo, es importante considerar cómo la ansiedad podría estar afectando tu bienestar general.";
            recomendacion = "Te sugerimos buscar estrategias para manejar el estrés y la ansiedad, como la meditación, ejercicios de respiración o hablar con alguien de confianza.";

     
        } 
        
        if (estadoAnimo.equals("Bueno") && nivelEnergia.equals("Alta")
                && estresAnsiedad.equals("A veces")) {
            balanceGeneral = "Hoy te sientes bien en general y tienes una gran cantidad de energía para tus actividades. Has experimentado algunos momentos de ansiedad o estrés, pero estos han sido ocasionales. Sigue monitoreando estos momentos para asegurarte de que no afecten tu bienestar a largo plazo.";
            recomendacion = "Considera practicar técnicas de manejo del estrés, como la meditación, la respiración profunda o hacer pausas cortas durante el día para relajarte. Esto puede ayudarte a reducir la ansiedad cuando surja y a mantener tu bienestar emocional.";
     
        }
        
        if (estadoAnimo.equals("Bueno") && nivelEnergia.equals("Alta")
                && estresAnsiedad.equals("Nunca")) {
            balanceGeneral = "Hoy te sientes bien en general y tienes mucha energía para realizar tus actividades. Además, no has experimentado estrés ni ansiedad en ningún momento del día, lo que indica un estado emocional y físico muy positivo.";
            recomendacion = "Continúa manteniendo este enfoque positivo y activo en tu vida diaria. Considera implementar prácticas de autocuidado, como ejercicio regular y tiempo para relajarte, para seguir fomentando este bienestar.";
   
        }
        
        //Bueno - Normal
        if (estadoAnimo.equals("Bueno") && nivelEnergia.equals("Normal")
                && estresAnsiedad.equals("Todo el dia")) {
            balanceGeneral = "Hoy te sientes generalmente bien, pero tu nivel de energía ha sido normal. Sin embargo, has experimentado ansiedad de manera constante durante todo el día, lo cual es motivo de preocupación. Aunque tu estado de ánimo es positivo, la ansiedad persistente puede afectar tu bienestar general.";
            recomendacion = "Te sugerimos explorar estrategias para manejar la ansiedad, como la práctica de la meditación, ejercicios de respiración o hablar con un profesional de la salud mental. También puede ser útil identificar las causas de tu ansiedad para abordarlas de manera efectiva.";
   
        }
        
        if (estadoAnimo.equals("Bueno") && nivelEnergia.equals("Normal")
                && estresAnsiedad.equals("A veces")) {
            balanceGeneral = "Hoy te sientes bien en general y tu nivel de energía ha sido normal, lo que sugiere que has podido llevar a cabo tus actividades sin problemas. Sin embargo, has experimentado momentos de ansiedad en algunas ocasiones, lo cual es común y puede ser manejable.";
            recomendacion = "Considera técnicas de manejo del estrés para esos momentos de ansiedad, como la práctica de mindfulness, ejercicios de respiración o realizar actividades que disfrutes. Esto puede ayudarte a mantener tu bienestar emocional y prevenir que la ansiedad afecte tu estado de ánimo general.";
   
        }
        
        if (estadoAnimo.equals("Bueno") && nivelEnergia.equals("Normal")
                && estresAnsiedad.equals("Nunca")) {
            balanceGeneral = "Hoy te sientes bien en general y tu nivel de energía ha sido normal, lo que indica que has podido realizar tus actividades sin inconvenientes. Además, no has experimentado estrés ni ansiedad en ningún momento del día, lo que es un indicador positivo de tu bienestar emocional.";
            recomendacion = "Continúa con este enfoque saludable. Mantener prácticas de autocuidado, como ejercicio regular y momentos de relajación, puede ayudarte a conservar este estado de bienestar. Disfruta de tu día y de las actividades que te hagan sentir bien."; 
        }
        
        //Bueno - Baja
        if (estadoAnimo.equals("Bueno") && nivelEnergia.equals("Baja")
                && estresAnsiedad.equals("Todo el dia")) {
            balanceGeneral = "Hoy te sientes generalmente bien, pero tu nivel de energía ha sido bajo, lo que puede dificultar la realización de tus actividades diarias. Además, has experimentado ansiedad de manera constante durante todo el día, lo cual puede ser un factor que contribuya a tu fatiga.";
            recomendacion = "Es importante que busques formas de manejar la ansiedad, ya que puede estar afectando tu energía y bienestar general. Considera prácticas como la meditación, ejercicios de respiración o actividades que te relajen. También asegúrate de descansar lo suficiente y de cuidar tu salud física para aumentar tu energía."; 
        }
        
        if (estadoAnimo.equals("Bueno") && nivelEnergia.equals("Baja")
                && estresAnsiedad.equals("A veces")) {
            balanceGeneral = "Hoy te sientes generalmente bien, pero tu nivel de energía ha sido bajo, lo que podría dificultar la realización de tus actividades. Has experimentado momentos de ansiedad en ocasiones, lo cual puede contribuir a tu sensación de fatiga.";
            recomendacion = "Te sugerimos que identifiques las situaciones que pueden estar causando la ansiedad y explores estrategias para manejarlas, como la práctica de la meditación, ejercicios de respiración o simplemente dedicar tiempo a actividades que disfrutes. También considera incorporar pausas regulares y cuidar tu descanso para mejorar tu nivel de energía."; 
        }
        
        if (estadoAnimo.equals("Bueno") && nivelEnergia.equals("Baja")
                && estresAnsiedad.equals("Nunca")) {
            balanceGeneral = "Hoy te sientes generalmente bien, pero tu nivel de energía ha sido bajo, lo que podría dificultar la realización de tus actividades diarias. Afortunadamente, no has experimentado estrés ni ansiedad en ningún momento del día, lo que indica que tu estado emocional es positivo a pesar de la fatiga.";
            recomendacion = "Es importante que busques formas de aumentar tu energía, como asegurarte de descansar adecuadamente, alimentarte de manera equilibrada y realizar actividad física moderada. También puedes considerar dedicar tiempo a actividades que te recarguen y te hagan sentir bien."; 
        }
        
        
        //NEUTRO
        //Neutro - alta
        if (estadoAnimo.equals("Neutro") && nivelEnergia.equals("Alta")
                && estresAnsiedad.equals("Todo el dia")) {
            balanceGeneral = "Hoy te has sentido con un estado de ánimo neutro, sin grandes emociones positivas o negativas, pero has tenido un alto nivel de energía, lo que indica que has podido mantenerte activo. Sin embargo, la ansiedad ha estado presente de manera constante durante todo el día, lo cual puede estar afectando tu bienestar emocional.";
            recomendacion = "Es importante que encuentres formas de gestionar la ansiedad para evitar que impacte tu salud a largo plazo. Prueba técnicas como la meditación, respiración profunda o actividades físicas que te ayuden a liberar tensión. Mantén un equilibrio entre tus actividades y el descanso para cuidar tu bienestar general.";
        } 
        
        if (estadoAnimo.equals("Neutro") && nivelEnergia.equals("Alta")
                && estresAnsiedad.equals("A veces")) {
            balanceGeneral = "Hoy te has sentido con un estado de ánimo neutro, sin emociones especialmente positivas o negativas, pero has tenido un alto nivel de energía, lo que te ha permitido mantenerte activo. Has experimentado momentos de ansiedad en algunas ocasiones, pero no de manera constante.";
            recomendacion = "Aunque tu ansiedad no es persistente, es recomendable que sigas monitoreando estos momentos y explores técnicas de manejo del estrés, como la respiración profunda, pausas activas o actividades que disfrutes. Mantener un equilibrio entre tus actividades y el descanso es clave para seguir gestionando bien tu energía y emociones.";
        } 
        
        if (estadoAnimo.equals("Neutro") && nivelEnergia.equals("Alta")
                && estresAnsiedad.equals("Nunca")) {
            balanceGeneral = "Hoy te has sentido con un estado de ánimo neutro, sin emociones especialmente positivas o negativas, pero has tenido un alto nivel de energía, lo que te ha permitido realizar tus actividades de manera activa. Además, no has experimentado estrés ni ansiedad en ningún momento, lo que indica un buen balance emocional.";
            recomendacion = "Continúa manteniendo este nivel de energía y bienestar emocional. Para seguir en esta línea positiva, asegúrate de equilibrar tus actividades con momentos de relajación y autocuidado. Esto te ayudará a mantener un estado estable tanto física como emocionalmente.";
        } 
        
        //Neutro - normal
        if (estadoAnimo.equals("Neutro") && nivelEnergia.equals("Normal")
                && estresAnsiedad.equals("Todo el dia")) {
            balanceGeneral = "Hoy te has sentido en un estado de ánimo neutro, sin emociones especialmente positivas o negativas, y tu nivel de energía ha sido normal, permitiéndote realizar tus actividades diarias de manera adecuada. Sin embargo, la ansiedad ha estado presente todo el día, lo que puede estar afectando tu bienestar emocional, a pesar de tu energía estable.";
            recomendacion = "Es importante que tomes medidas para manejar la ansiedad persistente. Prueba técnicas de relajación, como la meditación, ejercicios de respiración o actividades que disfrutes para liberar tensión. Mantener un equilibrio entre tus responsabilidades y momentos de autocuidado es clave para mejorar tu estado emocional.";
        }
        
        if (estadoAnimo.equals("Neutro") && nivelEnergia.equals("Normal")
                && estresAnsiedad.equals("A veces")) {
            balanceGeneral = "Hoy te has sentido en un estado de ánimo neutro, sin emociones especialmente positivas o negativas, y tu nivel de energía ha sido normal, lo que te ha permitido realizar tus actividades sin dificultades. Has experimentado momentos de ansiedad en algunas ocasiones, pero no de manera constante.";
            recomendacion = "Monitorea los momentos en los que sientes ansiedad y trata de identificar qué los está provocando. Practicar técnicas de relajación, como ejercicios de respiración o pequeñas pausas durante el día, puede ayudarte a manejar mejor estos momentos y a mantener un equilibrio emocional.";
        }
        
        if (estadoAnimo.equals("Neutro") && nivelEnergia.equals("Normal")
                && estresAnsiedad.equals("Nunca")) {
            balanceGeneral = "Hoy te has sentido en un estado de ánimo neutro, sin emociones especialmente positivas o negativas, y tu nivel de energía ha sido normal, lo que te ha permitido realizar tus actividades de manera estable. Además, no has experimentado estrés ni ansiedad en ningún momento del día, lo que indica un buen balance emocional.";
            recomendacion = "Mantén este equilibrio emocional y físico. Sigue practicando hábitos de autocuidado, como descansar lo suficiente y tomarte tiempo para relajarte. Esto te ayudará a mantener un estado de bienestar constante y a prevenir el estrés en el futuro.";
        }
        
        //Neutro - Baja
        if (estadoAnimo.equals("Neutro") && nivelEnergia.equals("Baja")
                && estresAnsiedad.equals("Todo el dia")) {
            balanceGeneral = "Hoy te has sentido en un estado de ánimo neutro, sin emociones intensas, pero tu nivel de energía ha sido bajo, lo que puede haber dificultado algunas de tus actividades. Además, has experimentado ansiedad de manera constante durante todo el día, lo que podría estar influyendo en tu fatiga y bienestar emocional.";
            recomendacion = "Es fundamental que encuentres formas de manejar la ansiedad que has sentido durante el día. Técnicas como la meditación, respiración profunda o ejercicios de relajación pueden ayudarte. También es importante descansar adecuadamente y tomar pequeñas pausas para recargar tu energía física y emocional.";
        }
        
        if (estadoAnimo.equals("Neutro") && nivelEnergia.equals("Baja")
                && estresAnsiedad.equals("A veces")) {
            balanceGeneral = "Hoy te has sentido en un estado de ánimo neutro, sin emociones intensas ni negativas, pero tu nivel de energía ha sido bajo, lo que puede haber afectado tu productividad o motivación. Has experimentado algunos momentos de ansiedad durante el día, aunque no de manera constante.";
            recomendacion = "Para mejorar tu energía y manejar esos momentos de ansiedad, te recomendamos realizar actividades que te relajen, como pequeños descansos, ejercicios de respiración o meditación. Asegúrate de descansar adecuadamente y prestar atención a las causas de tu ansiedad para abordarlas de manera efectiva.";
        }
        
        
       
    }
}
