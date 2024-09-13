        public class conta {
        private double valorsaque;
        private double valordepo;
        private double saldo;
        private double transf;

        conta (){}

        conta (double saque, double depo, double saldo, double transf){
            this.saldo = saldo;
            this.saque = saque;
            this.transf = transf;
            this.valordepo = depo;
        } 
            public double getValorsaque() {
                            return valorsaque;
            }

            public void setValorsaque(double valorsaque) {
                this.valorsaque = valorsaque;
            }

            public double getValordepo() {
                return valordepo;
            }

            public void setValordepo(double valordepo) {
                this.valordepo = valordepo;
            }

            public double getSaldo() {
                return saldo;
            }

            public void setSaldo(double saldo) {
                this.saldo = saldo;
            }

            public double getTransf() {
                return transf;
            }

            public void setTransf(double transf) {
                this.transf = transf;
            }
            // FIM GETTERS AND SETTERS
            public void saque (){

                

            }

    


 }
 