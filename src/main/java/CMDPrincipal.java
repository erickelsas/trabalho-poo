//Nome: Erick Elsas de Freitas - RA: 2347938

public class CMDPrincipal{
	public static void main(String arg[]){
		Paciente p[] = new Paciente[50];
		Medico m[] = new Medico[50];
		Enfermeiro e[] = new Enfermeiro[50];
		Leitura l = new Leitura();
		int op = 10, 
			op1 = 10, 
			x = 0, 
			y = 0, 
			z = 0, 
			i = 0, 
			w = 0, 
			r = 0, 
			mc = 0, 
			pc = 0, 
			ec = 0, 
			efc = 0, 
			count = 0, 
			count1 = 0, 
			count2 = 0,
			efid = 0,
			flag = 0;
		float porc;
		String cpf = "", espec = "";
		ExameFisico[] ef = new ExameFisico[50];
		Consulta[] cons = new Consulta[50];
	
		do{
			System.out.println("1 - CADASTRAR");
			System.out.println("2 - IMPRIMIR");
			System.out.println("3 - REAJUSTAR");
			System.out.println("4 - CONSULTAS/EXAMES");
			System.out.println("0 - SAIR");
			
			op = Integer.parseInt(l.entDados("INSIRA A OPERACAO QUE DESEJA REALIZAR: "));
			System.out.println("");
			switch(op){
				case 1:					
					do{
						System.out.println("1 - CADASTRAR PACIENTE");
						System.out.println("2 - CADASTRAR MEDICO");
						System.out.println("3 - CADASTRAR ENFERMEIRO");
						System.out.println("0 - SAIR");
				
						op1 = Integer.parseInt(l.entDados("INSIRA A OPERACAO QUE DESEJA REALIZAR: "));
						System.out.println("");
						switch(op1){
							case 1:
								p[x] = new Paciente();
								System.out.println("\t\tCADASTRO PACIENTE");
								p[x].entraDados();
								x++;
								break;

							case 2:
								m[y] = new Medico();
								System.out.println("\t\tCADASTRO MEDICO");
								m[y].entraDados();
								y++;
								break;

							case 3:
								e[z] = new Enfermeiro();
								System.out.println("\t\tCADASTRO ENFERMEIRO");
								e[z].entraDados();
								z++;
								break;

							case 0:
								System.out.println("\t\tRETORNANDO AO MENU PRINCIPAL!");
								break;

							default:
								System.out.println("VALOR INVALIDO!");
								break;
							}
					}while(op1 != 0);
					break;

				case 2:
					do{
						System.out.println("1 - VER TODOS PACIENTES");
						System.out.println("2 - VER TODOS MEDICOS");
						System.out.println("3 - VER TODOS ENFERMEIROS");
						System.out.println("4 - BUSCAR CPF PACIENTE");
						System.out.println("5 - BUSCAR CPF MEDICO");
						System.out.println("6 - BUSCAR CPF ENFERMEIRO");
						System.out.println("0 - SAIR");
						op1 = Integer.parseInt(l.entDados("INSIRA A OPERACAO QUE DESEJA REALIZAR: "));
						System.out.println("");

						switch(op1){
							case 1:
								for(i = 0, count = 0; i < x; i++){
									p[i].impDados();
									count++;
								}

								if(count == 0){
									System.out.println("Nao existem pacientes cadastrados!\n");
								}
								break;

							case 2:
								for(i = 0, count = 0; i < y; i++){
									m[i].impDados();
									count++;
								}

								if(count == 0){
									System.out.println("Nao existem medicos cadastrados!\n");
								}
								break;

							case 3:
								for(i = 0, count = 0; i < z; i++){
									e[i].impDados();
									count++;
								}


								if(count == 0){
									System.out.println("Nao existem pacientes cadastrados!\n");
								}
								break;

							case 4:
								cpf = l.entDados("INSIRA O CPF QUE DESEJA BUSCAR: ");
								for(i = 0, count = 0; i < x; i++){
									if(p[i].buscaCpf(cpf)){
										p[i].impDados();
										count++;
									}
								}
								
								if(count == 0){
									System.out.println("CPF nao encontrado!\n");
								}
								break;

							case 5:
								cpf = l.entDados("INSIRA O CPF QUE DESEJA BUSCAR: ");
								for(i = 0, count = 0; i < y; i++){
									if(p[i].buscaCpf(cpf)){
										m[i].impDados();
										count++;
									}
								}

								if(count == 0){
									System.out.println("CPF nao encontrado!\n");
								}
								break;

							case 6:
								cpf = l.entDados("INSIRA O CPF QUE DESEJA BUSCAR: ");
								for(i = 0, count = 0; i < z; i++){
									if(e[i].buscaCpf(cpf)){
										e[i].impDados();
										count++;
									}
								}

								if(count == 0){
									System.out.println("CPF nao encontrado!\n");
								}
								break;

							case 0:
								System.out.println("\t\tRETORNANDO AO MENU PRINCIPAL!");
								break;

							default:
								System.out.println("VALOR INVALIDO!");
								break;
					}
					}while(op1 != 0);
					break;

				case 3:
					do{
						System.out.println("1 - REAJUSTAR ENFERMEIRO");
						System.out.println("2 - REAJUSTAR MEDICO");
						System.out.println("0 - SAIR");
						op1 = Integer.parseInt(l.entDados("INSIRA A OPERACAO QUE DESEJA REALIZAR: "));
						System.out.println("");

						switch(op1){
							case 1:
								cpf = l.entDados("INSIRA O CPF QUE DESEJA BUSCAR: ");
								for(i = 0, count = 0; i < z; i++){
									if(e[i].buscaCpf(cpf)){
										count++;
										porc = Float.parseFloat(l.entDados("Informe a porcentagem em que deseja reajustar (0 = Reajuste Automatico)"));
										if(porc == 0){
											e[i].reajustaSal();
											System.out.println("SALARIO REAJUSTADO: " + m[i].getSalario());
										} else {
											e[i].reajustaSal(porc);
											System.out.println("SALARIO REAJUSTADO: " + m[i].getSalario());
										}
									}
								}	

								if(count == 0){
									System.out.println("CPF nao encontrado!\n");
								}
								break;

							case 2:
								cpf = l.entDados("INSIRA O CPF QUE DESEJA BUSCAR: ");
								for(i = 0, count = 0; i < y; i++){
									if(m[i].buscaCpf(cpf)){
										count++;
										porc = Float.parseFloat(l.entDados("Informe a porcentagem em que deseja reajustar (0 = Reajuste Automatico)"));
										if(porc == 0){
											m[i].reajustaSal();
											System.out.println("SALARIO REAJUSTADO: " + e[i].getSalario());
										} else {
											m[i].reajustaSal(porc);
											System.out.println("SALARIO REAJUSTADO: " + e[i].getSalario());
										}
									}
								}

								if(count == 0){
									System.out.println("CPF nao encontrado!\n");
								}
								break;

							case 0:
								System.out.println("\t\tRETORNANDO AO MENU PRINCIPAL!");
								break;

							default:
								System.out.println("VALOR INVALIDO!");
								break;
						}
					}while(op1 != 0);
					break;

				case 4:
					do{
						System.out.println("1 - AGENDAR CONSULTA");
						System.out.println("2 - REGISTRAR EXAME FISICO");
						System.out.println("0 - SAIR");
						op1 = Integer.parseInt(l.entDados("INSIRA A OPERACAO QUE DESEJA REALIZAR: "));
						System.out.println("");
						switch(op1){
							case 1:
								espec = l.entDados("INSIRA A ESPECIALIZACAO QUE DESEJA AGENDAR CONSULTA: ");
								for(i = 0, count = 0; i < y; i++){
									if(m[i].buscaEspec(espec)){
										mc = i;
										count++;
									}
								}

								cpf = l.entDados("INSIRA O CPF DO PACIENTE: ");
								for(i = 0, count1 = 0; i < x; i++){
									if(p[i].buscaCpf(cpf)){
										pc = i;
										count1++;
									}
								}

								efid = Integer.parseInt(l.entDados("INSIRA O ID DO EXAME FISICO: "));
								for(i = 0, count2 = 0; i < w; i++){
									if(ef[i].buscaId(efid)){
										efc = i;
									}
								}

								if(count == 0){
									System.out.println("Nao existe um medico especializado em " + espec + " no hospital!");
								}

								if(count1 == 0){
									System.out.println("Paciente nao encontrado!");
								}

								if(count2 == 0){
									System.out.println("Exame fisico nao encontrado!");
								}
									
								if(count == 1 && count1 == 1 && count2 == 1){
									flag = 1;
									do{
										try{
											cons[w] = new Consulta(p[pc], m[mc], ef[efc]);
											cons[w].setConsultaId(Integer.parseInt(l.entDados("Insira o ID da consulta: ")));
											cons[w].getDataConsulta().setDia(Integer.parseInt(l.entDados("Insira o dia da consulta: ")));
											cons[w].getDataConsulta().setMes(Integer.parseInt(l.entDados("Insira o mes da consulta: ")));
											cons[w].getDataConsulta().setAno(Integer.parseInt(l.entDados("Insira o ano da consulta: ")));
											cons[w].getDataConsulta().setHora(Integer.parseInt(l.entDados("Insira a hora da consulta: ")));
											cons[w].getDataConsulta().setMinutos(Integer.parseInt(l.entDados("Insira os minutos da consulta: ")));
											w++;							
										}
										catch(DiaInvalidoException die){
											die.impErro();
										}
										catch(MesInvalidoException mie){
											mie.impErro();
										}
										catch(AnoInvalidoException aie){
											aie.impErro();
										}
										catch(HoraInvalidaException hie){
											hie.impErro();
										}
										catch(MinutosInvalidosException mie){
											mie.impErro();
										}
									
									}while(flag != 0);
								} 
								break;

							case 2:
								cpf = l.entDados("Insira o CPF do enfermeiro: ");
								for(i = 0, count = 0; i < z; i++){
									if(e[i].buscaCpf(cpf)){
										ec = i;
										count++;
									}
								}

								cpf = l.entDados("INSIRA O CPF DO PACIENTE: ");
								for(i = 0, count1 = 0; i < x; i++){
									if(p[i].buscaCpf(cpf)){
										pc = i;
										count1++;
									}
								}
								

								if(count == 0){
									System.out.println("Enfermeiro nao encontrado!");
								}
								
								if(count1 == 0){
									System.out.println("Paciente nao encontrado!");
								}

								if(count == 1 && count1 == 1){
									flag = 1;
									do{
										try{
											ef[r] = new ExameFisico(p[pc], e[ec]);
											ef[r].setExameId(Integer.parseInt(l.entDados("Insira o ID do exame fisico: ")));
											ef[r].getPres().setFaixaSisNorm(Integer.parseInt(l.entDados("Insira a faixa sistalica normalizada: ")));
											ef[r].getPres().setNumDiastNorm(Integer.parseInt(l.entDados("Insira o numero diastolico normalizado: ")));
											ef[r].setSintomas(l.entDados("Informe os sintoams do paciente: "));
											ef[r].setObservacoes(l.entDados("Faca observacoes sobre o estado do paciente: "));
											r++;											
										}
										catch(NumberFormatException nfe){
											System.out.println("O atributo deve ser um numero!");
										}
									}while(flag != 0);
								}
	

								break;
								
								
								case 0:
									System.out.println("Fechando programa!!");
									break;
					
								default:
									System.out.println("Numero inserido invalido!");
									break;
						}		
					}while(op1 != 0);
					break;
				

			}
			System.out.println("\n");
		}while(op != 0);
	}
}