    public class Postventa {
    private String descripcionProblema;
    private String fechaSolicitudServicio;
    private Electrodomestico electrodomestico;
    private Cliente cliente;

        public String getDescripcionProblema() {
            return descripcionProblema;
        }

        public void setDescripcionProblema(String descripcionProblema) {
            this.descripcionProblema = descripcionProblema;
        }

        public String getFechaSolicitudServicio() {
            return fechaSolicitudServicio;
        }

        public void setFechaSolicitudServicio(String fechaSolicitudServicio) {
            this.fechaSolicitudServicio = fechaSolicitudServicio;
        }

        public Electrodomestico getElectrodomestico() {
            return electrodomestico;
        }

        public void setElectrodomestico(Electrodomestico electrodomestico) {
            this.electrodomestico = electrodomestico;
        }

        public Cliente getCliente() {
            return cliente;
        }

        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }
    }
