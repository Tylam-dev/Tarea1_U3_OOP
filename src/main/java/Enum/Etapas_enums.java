package Enum;
//Enum para evitar datos "quemados" con la respectiva logica de etapas.
public enum Etapas_enums {
    OCTAVOS_DE_FINAL("OCTAVOS DE FINAL", 1, 16),
    CUARTOS_DE_FINAL("CUARTOS DE FINAL", 2, 8),
    SEMIFINAL("SEMIFINAL", 3, 4),
    FINAL("FINAL", 4, 2);
    private String descripcion;
    private int id;
    private int cantEquipos;

    // Constructor
    Etapas_enums(String descripcion, int id, int cantEquipos) {
        this.descripcion = descripcion;
        this.id = id;
        this.cantEquipos = cantEquipos;
    }

    // Método para obtener la descripción
    public String getDescripcion() {
        return descripcion;
    }
    public int getId() {
        return id;
    }
    public int getCantEquipos() {
        return cantEquipos;
    }
    // Método estático para buscar por id
    public static Etapas_enums fromId(int id) {
        for (Etapas_enums etapa : Etapas_enums.values()) {
            if (etapa.id == id) {
                return etapa;
            }
        }
        throw new IllegalArgumentException("No existe una etapa con el id: " + id);
    }
}
