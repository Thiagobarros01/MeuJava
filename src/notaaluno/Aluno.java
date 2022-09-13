package notaaluno;

public class Aluno {
	public String nome;
	public double grade1;
	public double grade2;
	public double grade3;
	
	

	public double finalGrade() {
		return grade1 + grade2 + grade3;
		
	
	}

	public double restPontos() {
		if (finalGrade() < 60) {
			return 60 - finalGrade();
		} else {
			return 0.0;
		}
		
	}

	public String situacao() {
		if (grade1 + grade2 + grade3 < 60) {
			return "O ALUNO ESTÁ REPROVADO POR "+restPontos()+" PONTOS";
	} else 
		return "O ALUNO ESTÁ APROVADO!";
}
}