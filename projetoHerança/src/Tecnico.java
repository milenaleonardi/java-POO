
public class Tecnico extends Aluno {
		private int registroProfissional;
		private int experiencia;
		
		public void praticar(int exp) {
			this.setExp(getExperiencia() + 1);
			if(this.getExperiencia() <= 5) {
				System.out.println("Nivel: Iniciante. Experiencia: " + this.getExperiencia());
			} else if (this.getExperiencia() <= 10) {
				System.out.println("Nivel: Intermediário. Experiencia: " + this.getExperiencia());
			} else if (this.getExperiencia() <= 20) {
				System.out.println("Nivel: Avançado. Experiencia: " + this.getExperiencia());
			}
		}
		
		public void setRegProfissional(int rp) {
			this.registroProfissional = rp;
		}
		
		public int getRegProfissional() {
			return registroProfissional;
		}
		
		public void setExp(int exp) {
			this.experiencia = exp;
		}
		
		public int getExperiencia() {
			return experiencia;
		}
		
	}

