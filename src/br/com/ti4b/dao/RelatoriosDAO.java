package br.com.ti4b.dao;

/**
 *
 * @author StreamRead
 */
public class RelatoriosDAO {

    /*  relatorios relatorios = new relatorios();
    
     public void relatoriosReproducao(String nomeRelatorio, String cod) {
     switch (nomeRelatorio) {
     case "relatorioAnimalIndividual":
     String relatorioAnimalIndividual = "SELECT\n"
     + "animal.cod_animal AS animal_cod_animal,\n"
     + "animal.cod_instituicao AS animal_cod_instituicao,\n"
     + "animal.cod_origem AS animal_cod_origem,\n"
     + "animal.cod_fase AS animal_cod_fase,\n"
     + "animal.nome AS animal_nome,\n"
     + "animal.sexo AS animal_sexo,\n"
     + "animal.raca AS animal_raca,\n"
     + "animal.cor AS animal_cor,\n"
     + "animal.idade AS animal_idade,\n"
     + "animal.peso AS animal_peso,\n"
     + "animal.grau_sangue AS animal_grau_sangue,\n"
     + "animal.informacao AS animal_informacao,\n"
     + "fase.cod_fase AS fase_cod_fase,\n"
     + "fase.cod_clasificacao AS fase_cod_clasificacao,\n"
     + "fase.descricao AS fase_descricao,\n"
     + "fase.período AS fase_período,\n"
     + "origem.cod_origem AS origem_cod_origem,\n"
     + "origem.cod_for_animal AS origem_cod_for_animal,\n"
     + "origem.cod_leilao AS origem_cod_leilao,\n"
     + "origem.cod_nascimento AS origem_cod_nascimento,\n"
     + "origem.data_entrada AS origem_data_entrada,\n"
     + "classificacao.cod_classificacao AS classificacao_cod_classificacao,\n"
     + "classificacao.descricao AS classificacao_descricao,\n"
     + "origem_A.cod_origem AS origem_A_cod_origem,\n"
     + "origem_A.cod_for_animal AS origem_A_cod_for_animal,\n"
     + "origem_A.cod_leilao AS origem_A_cod_leilao,\n"
     + "origem_A.cod_nascimento AS origem_A_cod_nascimento,\n"
     + "origem_A.data_entrada AS origem_A_data_entrada\n"
     + "FROM\n"
     + "public.fase fase INNER JOIN public.animal animal ON fase.cod_fase = animal.cod_fase\n"
     + "INNER JOIN public.origem origem ON animal.cod_origem = origem.cod_origem\n"
     + "INNER JOIN public.origem origem_A ON animal.cod_origem = origem_A.cod_origem\n"
     + "INNER JOIN public.classificacao classificacao ON fase.cod_clasificacao = classificacao.cod_classificacao where cod_instituicao='" + cod + "'";
    
     relatorios.gerar_relatorio(relatorioAnimalIndividual, "C:/LEGADO/relatorios/producao/animais_cadastrados_post.jasper");
     break;
     case "relatorioAlimentoslIndividualConcentrado":
     String relatorioAlimentoslIndividualConcentrado = "SELECT\n"
     + "*,\n"
     + "concentrado.cod_concentrado AS concentrado_cod_concentrado,\n"
     + "concentrado.cod_for_alimento AS concentrado_cod_for_alimento,\n"
     + "concentrado.descricao AS concentrado_descricao,\n"
     + "concentrado.data_entrada AS concentrado_data_entrada,\n"
     + "concentrado.quant AS concentrado_quant,\n"
     + "concentrado.preco_unit AS concentrado_preco_unit,\n"
     + "fornecedor_alimento.cod_for_alimento AS fornecedor_alimento_cod_for_alimento,\n"
     + "fornecedor_alimento.cnpj AS fornecedor_alimento_cnpj,\n"
     + "fornecedor_alimento.nome AS fornecedor_alimento_nome\n"
     + "FROM\n"
     + "public.fornecedor_alimento fornecedor_alimento INNER JOIN public.concentrado concentrado ON fornecedor_alimento.cod_for_alimento = concentrado.cod_for_alimento where cod_concentrado=" + cod + "";
     relatorios.gerar_relatorio(relatorioAlimentoslIndividualConcentrado, "C:/LEGADO/relatorios/producao/alimentos_cadastrado_concentrado_post.jasper");
     break;
     case "relatorioAlimentoslIndividualVolumoso":
     String relatorioAlimentoslIndividualVolumoso = "SELECT\n"
     + "volumoso.cod_volumoso AS volumoso_cod_volumoso,\n"
     + "volumoso.descricao AS volumoso_descricao,\n"
     + "volumoso.data_entrada AS volumoso_data_entrada,\n"
     + "volumoso.quant AS volumoso_quant,\n"
     + "volumoso.preco_unit AS volumoso_preco_unit\n"
     + "FROM\n"
     + "public.volumoso volumoso where cod_volumoso=" + cod + "";
     relatorios.gerar_relatorio(relatorioAlimentoslIndividualVolumoso, "C:/LEGADO/relatorios/producao/alimentos_cadastrados_volumoso.jasper");
     break;
     case "relatorioMedicamentosIndividual":
     String relatorioMedicamentosIndividual = "SELECT\n"
     + "medicamento.cod_medicamento AS medicamento_cod_medicamento,\n"
     + "medicamento.descricao AS medicamento_descricao,\n"
     + "medicamento.eficacia AS medicamento_eficacia,\n"
     + "medicamento.quant AS medicamento_quant,\n"
     + "medicamento.preco_unit AS medicamento_preco_unit,\n"
     + "medicamento.data_validade AS medicamento_data_validade\n"
     + "FROM\n"
     + "public.medicamento medicamento where cod_medicamento=" + cod;
     relatorios.gerar_relatorio(relatorioMedicamentosIndividual, "C:/LEGADO/relatorios/producao/medicamentos_estoque_post.jasper");
     break;
     case "relatorioCampanhaIndividual":
     String relatorioCampanhaIndividual = "SELECT\n"
     + "vacina_obrigatoria.cod_vacina AS vacina_obrigatoria_cod_vacina,\n"
     + "vacina_obrigatoria.descricao AS vacina_obrigatoria_descricao,\n"
     + "vacina_obrigatoria.periodo_aplicacao AS vacina_obrigatoria_periodo_aplicacao,\n"
     + "campanha.cod_campanha AS campanha_cod_campanha,\n"
     + "campanha.cod_animal AS campanha_cod_animal,\n"
     + "campanha.data_aplicacao AS campanha_data_aplicacao,\n"
     + "campanha.quant AS campanha_quant,\n"
     + "animal.nome AS animal_nome,\n"
     + "vacina_obrigatoria.preco_unit AS vacina_obrigatoria_preco_unit\n"
     + "FROM\n"
     + "public.vacina_obrigatoria vacina_obrigatoria INNER JOIN public.campanha campanha ON vacina_obrigatoria.cod_vacina = campanha.cod_vacina\n"
     + "INNER JOIN public.animal animal ON campanha.cod_animal = animal.cod_animal where cod_campanha=" + cod + "";
     relatorios.gerar_relatorio(relatorioCampanhaIndividual, "C:/LEGADO/relatorios/producao/vacinas_obrigatorias_post.jasper");
     break;
     case "relatorioConsultasIndividual":
     String relatorioConsultasIndividual = "SELECT\n"
     + "consulta.cod_consulta AS consulta_cod_consulta,\n"
     + "consulta.cod_animal AS consulta_cod_animal,\n"
     + "consulta.crmv AS consulta_crmv,\n"
     + "consulta.data_consulta AS consulta_data_consulta,\n"
     + "consulta.tipo_exame_encam AS consulta_tipo_exame_encam,\n"
     + "consulta.informacao AS consulta_informacao,\n"
     + "animal.cod_animal AS animal_cod_animal,\n"
     + "animal.nome AS animal_nome,\n"
     + "veterinario.cod_veterinario AS veterinario_cod_veterinario,\n"
     + "veterinario.crmv AS veterinario_crmv,\n"
     + "veterinario.nome AS veterinario_nome\n"
     + "FROM\n"
     + "public.animal animal INNER JOIN public.consulta consulta ON animal.cod_animal = consulta.cod_animal\n"
     + "INNER JOIN public.veterinario veterinario ON consulta.crmv = veterinario.crmv where cod_consulta=" + cod;
     relatorios.gerar_relatorio(relatorioConsultasIndividual, "C:/LEGADO/relatorios/producao/consultas.jasper");
     break;
    
     case "relatorioConsumoIndividualVolumoso":
     String relatorioConsumoIndividualVolumoso = " SELECT\n"
     + "consumo.cod_consumo AS consumo_cod_consumo,\n"
     + "consumo.cod_classificacao AS consumo_cod_classificacao,\n"
     + "consumo.cod_volumoso AS consumo_cod_volumoso,\n"
     + "consumo.cod_concentrado AS consumo_cod_concentrado,\n"
     + "consumo.quantidade AS consumo_quantidade,\n"
     + "consumo.data_consumo AS consumo_data_consumo,\n"
     + "volumoso.cod_volumoso AS volumoso_cod_volumoso,\n"
     + "volumoso.descricao AS volumoso_descricao,\n"
     + "volumoso.data_entrada AS volumoso_data_entrada,\n"
     + "volumoso.quant AS volumoso_quant,\n"
     + "volumoso.preco_unit AS volumoso_preco_unit,\n"
     + "classificacao.cod_classificacao AS classificacao_cod_classificacao,\n"
     + "classificacao.descricao AS classificacao_descricao\n"
     + "FROM\n"
     + "public.volumoso volumoso INNER JOIN public.consumo consumo ON volumoso.cod_volumoso = consumo.cod_volumoso\n"
     + "INNER JOIN public.classificacao classificacao ON consumo.cod_classificacao = classificacao.cod_classificacaowhere cod_consumo=" + cod + " ";
     relatorios.gerar_relatorio(relatorioConsumoIndividualVolumoso, "C:/LEGADO/relatorios/producao/consumo_volumoso.jasper");
     break;
     case "relatorioConsumoIndividualconcentrado":
     String relatorioConsumoIndividualconcentrado = "SELECT\n"
     + "consumo.cod_consumo AS consumo_cod_consumo,\n"
     + "consumo.cod_classificacao AS consumo_cod_classificacao,\n"
     + "consumo.cod_volumoso AS consumo_cod_volumoso,\n"
     + "consumo.cod_concentrado AS consumo_cod_concentrado,\n"
     + "consumo.quantidade AS consumo_quantidade,\n"
     + "consumo.data_consumo AS consumo_data_consumo,\n"
     + "concentrado.cod_concentrado AS concentrado_cod_concentrado,\n"
     + "concentrado.cod_for_alimento AS concentrado_cod_for_alimento,\n"
     + "concentrado.descricao AS concentrado_descricao,\n"
     + "concentrado.data_entrada AS concentrado_data_entrada,\n"
     + "concentrado.quant AS concentrado_quant,\n"
     + "concentrado.preco_unit AS concentrado_preco_unit,\n"
     + "classificacao.cod_classificacao AS classificacao_cod_classificacao,\n"
     + "classificacao.descricao AS classificacao_descricao\n"
     + "FROM\n"
     + "public.concentrado concentrado INNER JOIN public.consumo consumo ON concentrado.cod_concentrado = consumo.cod_concentrado\n"
     + "INNER JOIN public.classificacao classificacao ON consumo.cod_classificacao = classificacao.cod_classificacao where cod_consumo=" + cod + " ";
     relatorios.gerar_relatorio(relatorioConsumoIndividualconcentrado, "C:/LEGADO/relatorios/producao/consumo_concentrado.jasper");
     break;
     case "relatoriodiagnosticoIndividual":
     String relatoriodiagnosticoIndividual = "SELECT\n"
     + "animal.cod_animal AS animal_cod_animal,\n"
     + "animal.cod_instituicao AS animal_cod_instituicao,\n"
     + "animal.cod_origem AS animal_cod_origem,\n"
     + "animal.cod_fase AS animal_cod_fase,\n"
     + "animal.nome AS animal_nome,\n"
     + "animal.sexo AS animal_sexo,\n"
     + "animal.raca AS animal_raca,\n"
     + "animal.cor AS animal_cor,\n"
     + "animal.idade AS animal_idade,\n"
     + "animal.data_nascimento AS animal_data_nascimento,\n"
     + "animal.peso AS animal_peso,\n"
     + "animal.grau_sangue AS animal_grau_sangue,\n"
     + "animal.informacao AS animal_informacao,\n"
     + "consulta.cod_consulta AS consulta_cod_consulta,\n"
     + "consulta.cod_animal AS consulta_cod_animal,\n"
     + "consulta.crmv AS consulta_crmv,\n"
     + "consulta.data_consulta AS consulta_data_consulta,\n"
     + "consulta.tipo_exame_encam AS consulta_tipo_exame_encam,\n"
     + "consulta.informacao AS consulta_informacao,\n"
     + "diagnostico.cod_diagnostico AS diagnostico_cod_diagnostico,\n"
     + "diagnostico.cod_consulta AS diagnostico_cod_consulta,\n"
     + "diagnostico.cod_doenca AS diagnostico_cod_doenca,\n"
     + "diagnostico.data_diagnostico AS diagnostico_data_diagnostico,\n"
     + "diagnostico.informacao AS diagnostico_informacao,\n"
     + "doenca.cod_doenca AS doenca_cod_doenca,\n"
     + "doenca.descricao AS doenca_descricao\n"
     + "FROM\n"
     + "public.animal animal INNER JOIN public.consulta consulta ON animal.cod_animal = consulta.cod_animal\n"
     + "INNER JOIN public.diagnostico diagnostico ON consulta.cod_consulta = diagnostico.cod_consulta\n"
     + "INNER JOIN public.doenca doenca ON diagnostico.cod_doenca = doenca.cod_doenca where cod_diagnostico=" + cod + " ";
     relatorios.gerar_relatorio(relatoriodiagnosticoIndividual, "C:/LEGADO/relatorios/producao/diagnostico_individual_post.jasper");
     break;
     case "relatorioFornecedorAlimentoIndividual":
     String relatorioFornecedorAlimentoIndividual = "SELECT\n"
     + "fornecedor_alimento.cod_for_alimento AS fornecedor_alimento_cod_for_alimento,\n"
     + "fornecedor_alimento.numero_licitacao AS fornecedor_alimento_numero_licitacao,\n"
     + "fornecedor_alimento.cnpj AS fornecedor_alimento_cnpj,\n"
     + "fornecedor_alimento.nome AS fornecedor_alimento_nome,\n"
     + "fornecedor_alimento.endereco AS fornecedor_alimento_endereco,\n"
     + "fornecedor_alimento.numero AS fornecedor_alimento_numero,\n"
     + "fornecedor_alimento.bairro AS fornecedor_alimento_bairro,\n"
     + "fornecedor_alimento.cidade AS fornecedor_alimento_cidade,\n"
     + "fornecedor_alimento.uf AS fornecedor_alimento_uf,\n"
     + "fornecedor_alimento.email AS fornecedor_alimento_email,\n"
     + "fornecedor_alimento.fone1 AS fornecedor_alimento_fone1,\n"
     + "fornecedor_alimento.fone2 AS fornecedor_alimento_fone2\n"
     + "FROM\n"
     + "public.fornecedor_alimento fornecedor_alimento where cod_for_alimento=" + cod + " ";
     relatorios.gerar_relatorio(relatorioFornecedorAlimentoIndividual, "C:/LEGADO/relatorios/producao/fornecedor_alimentos_post.jasper");
     break;
     case "relatorioFornecedorAnimalIndividual":
     String relatorioFornecedorAnimalIndividual = "SELECT\n"
     + "fornecedor_animal.cod_for_animal AS fornecedor_animal_cod_for_animal,\n"
     + "fornecedor_animal.cnpj AS fornecedor_animal_cnpj,\n"
     + "fornecedor_animal.nome AS fornecedor_animal_nome,\n"
     + "fornecedor_animal.nome_proprietario AS fornecedor_animal_nome_proprietario,\n"
     + "fornecedor_animal.info AS fornecedor_animal_info,\n"
     + "fornecedor_animal.endereco AS fornecedor_animal_endereco,\n"
     + "fornecedor_animal.numero AS fornecedor_animal_numero,\n"
     + "fornecedor_animal.bairro AS fornecedor_animal_bairro,\n"
     + "fornecedor_animal.cidade AS fornecedor_animal_cidade,\n"
     + "fornecedor_animal.uf AS fornecedor_animal_uf,\n"
     + "fornecedor_animal.email AS fornecedor_animal_email,\n"
     + "fornecedor_animal.fone1 AS fornecedor_animal_fone1,\n"
     + "fornecedor_animal.fone2 AS fornecedor_animal_fone2\n"
     + "FROM\n"
     + "public.fornecedor_animal fornecedor_animal where cnpj='" + cod + "'";
     relatorios.gerar_relatorio(relatorioFornecedorAnimalIndividual, "C:/LEGADO/relatorios/producao/fornecedor_animais_post.jasper");
     break;
     case "relatorioProducaoIndividual":
     String relatorioProducaoIndividual = "SELECT\n"
     + "classificacao.cod_classificacao AS classificacao_cod_classificacao,\n"
     + "classificacao.descricao AS classificacao_descricao,\n"
     + "materia_prima.cod_materia AS materia_prima_cod_materia,\n"
     + "materia_prima.cod_classificacao AS materia_prima_cod_classificacao,\n"
     + "materia_prima.descricao AS materia_prima_descricao,\n"
     + "producao.cod_producao AS producao_cod_producao,\n"
     + "producao.cod_materia AS producao_cod_materia,\n"
     + "producao.quant AS producao_quant,\n"
     + "producao.data_producao AS producao_data_producao\n"
     + "FROM\n"
     + "public.classificacao classificacao INNER JOIN public.materia_prima materia_prima ON classificacao.cod_classificacao = materia_prima.cod_classificacao\n"
     + "INNER JOIN public.producao producao ON materia_prima.cod_materia = producao.cod_materia where cod_producao=" + cod + " ";
     relatorios.gerar_relatorio(relatorioProducaoIndividual, "C:/LEGADO/relatorios/producao/produçao_especie_post.jasper");
     break;
     case "relatorioTratamentoIndividual":
     String relatorioTratamentoIndividual = "SELECT\n"
     + "animal.cod_animal AS animal_cod_animal,\n"
     + "animal.cod_instituicao AS animal_cod_instituicao,\n"
     + "animal.cod_origem AS animal_cod_origem,\n"
     + "animal.cod_fase AS animal_cod_fase,\n"
     + "animal.nome AS animal_nome,\n"
     + "animal.sexo AS animal_sexo,\n"
     + "animal.raca AS animal_raca,\n"
     + "animal.cor AS animal_cor,\n"
     + "animal.idade AS animal_idade,\n"
     + "animal.peso AS animal_peso,\n"
     + "animal.grau_sangue AS animal_grau_sangue,\n"
     + "animal.informacao AS animal_informacao,\n"
     + "consulta.cod_consulta AS consulta_cod_consulta,\n"
     + "consulta.cod_animal AS consulta_cod_animal,\n"
     + "consulta.crmv AS consulta_crmv,\n"
     + "consulta.data_consulta AS consulta_data_consulta,\n"
     + "consulta.tipo_exame_encam AS consulta_tipo_exame_encam,\n"
     + "consulta.informacao AS consulta_informacao,\n"
     + "medicamento.cod_medicamento AS medicamento_cod_medicamento,\n"
     + "medicamento.descricao AS medicamento_descricao,\n"
     + "medicamento.eficacia AS medicamento_eficacia,\n"
     + "medicamento.quant AS medicamento_quant,\n"
     + "medicamento.preco_unit AS medicamento_preco_unit,\n"
     + "medicamento.data_validade AS medicamento_data_validade,\n"
     + "tratamento.cod_tratamento AS tratamento_cod_tratamento,\n"
     + "tratamento.cod_diagnostico AS tratamento_cod_diagnostico,\n"
     + "tratamento.cod_medicamento AS tratamento_cod_medicamento,\n"
     + "tratamento.data_tratamento AS tratamento_data_tratamento,\n"
     + "tratamento.periodo_tratamento AS tratamento_periodo_tratamento,\n"
     + "tratamento.quant AS tratamento_quant,\n"
     + "diagnostico.cod_diagnostico AS diagnostico_cod_diagnostico,\n"
     + "diagnostico.cod_consulta AS diagnostico_cod_consulta,\n"
     + "diagnostico.cod_doenca AS diagnostico_cod_doenca,\n"
     + "diagnostico.data_diagnostico AS diagnostico_data_diagnostico,\n"
     + "diagnostico.informacao AS diagnostico_informacao\n"
     + "FROM\n"
     + "public.animal animal INNER JOIN public.consulta consulta ON animal.cod_animal = consulta.cod_animal\n"
     + "INNER JOIN public.diagnostico diagnostico ON consulta.cod_consulta = diagnostico.cod_consulta\n"
     + "INNER JOIN public.tratamento tratamento ON diagnostico.cod_diagnostico = tratamento.cod_diagnostico\n"
     + "INNER JOIN public.medicamento medicamento ON tratamento.cod_medicamento = medicamento.cod_medicamento where cod_tratamento=" + cod + " ";
     relatorios.gerar_relatorio(relatorioTratamentoIndividual, "C:/LEGADO/relatorios/producao/tratamento_post.jasper");
     break;
     case "relatorioVeterinarioIndividual":
     String relatorioVeterinarioIndividual = "SELECT\n"
     + "veterinario.crmv AS veterinario_crmv,\n"
     + "veterinario.cpf AS veterinario_cpf,\n"
     + "veterinario.nome AS veterinario_nome,\n"
     + "veterinario.endereco AS veterinario_endereco,\n"
     + "veterinario.cidade AS veterinario_cidade,\n"
     + "veterinario.uf AS veterinario_uf,\n"
     + "veterinario.email AS veterinario_email,\n"
     + "veterinario.fone1 AS veterinario_fone1,\n"
     + "veterinario.fone2 AS veterinario_fone2,\n"
     + "veterinario.tipo_contrato AS veterinario_tipo_contrato,\n"
     + "veterinario.especialidade AS veterinario_especialidade,\n"
     + "veterinario.numero AS veterinario_numero,\n"
     + "veterinario.bairro AS veterinario_bairro\n"
     + "FROM\n"
     + "public.veterinario veterinario where crmv='" + cod + "' ";
     relatorios.gerar_relatorio(relatorioVeterinarioIndividual, "C:/LEGADO/relatorios/producao/VETERINARIO_POST.jasper");
     break;
     case "relatorioSaidaIndividualMorte":
     String relatorioSaidaIndividualMorte = "SELECT\n"
     + "animal.cod_animal AS animal_cod_animal,\n"
     + "animal.cod_instituicao AS animal_cod_instituicao,\n"
     + "animal.cod_origem AS animal_cod_origem,\n"
     + "animal.cod_fase AS animal_cod_fase,\n"
     + "animal.nome AS animal_nome,\n"
     + "animal.sexo AS animal_sexo,\n"
     + "animal.raca AS animal_raca,\n"
     + "animal.cor AS animal_cor,\n"
     + "animal.idade AS animal_idade,\n"
     + "animal.data_nascimento AS animal_data_nascimento,\n"
     + "animal.peso AS animal_peso,\n"
     + "animal.grau_sangue AS animal_grau_sangue,\n"
     + "animal.informacao AS animal_informacao,\n"
     + "morte.cod_morte AS morte_cod_morte,\n"
     + "morte.descricao AS morte_descricao,\n"
     + "saida.cod_saida AS saida_cod_saida,\n"
     + "saida.cod_animal AS saida_cod_animal,\n"
     + "saida.cod_leilao AS saida_cod_leilao,\n"
     + "saida.cod_morte AS saida_cod_morte,\n"
     + "saida.data_saida AS saida_data_saida,\n"
     + "saida.destino AS saida_destino,\n"
     + "saida.informacao AS saida_informacao\n"
     + "FROM\n"
     + "public.animal animal INNER JOIN public.saida saida ON animal.cod_animal = saida.cod_animal\n"
     + "INNER JOIN public.morte morte ON saida.cod_morte = morte.cod_morte where cod_saida='" + cod + "'";
     relatorios.gerar_relatorio(relatorioSaidaIndividualMorte, "C:/LEGADO/relatorios/producao/saida_morte.jasper");
     break;
     case "relatorioSaidaIndividualLeilao":
     String relatorioSaidaIndividualLeilao = "SELECT\n"
     + "saida.cod_saida AS saida_cod_saida,\n"
     + "saida.cod_animal AS saida_cod_animal,\n"
     + "saida.cod_leilao AS saida_cod_leilao,\n"
     + "saida.cod_morte AS saida_cod_morte,\n"
     + "saida.data_saida AS saida_data_saida,\n"
     + "saida.destino AS saida_destino,\n"
     + "saida.informacao AS saida_informacao,\n"
     + "animal.cod_animal AS animal_cod_animal,\n"
     + "animal.cod_instituicao AS animal_cod_instituicao,\n"
     + "animal.cod_origem AS animal_cod_origem,\n"
     + "animal.cod_fase AS animal_cod_fase,\n"
     + "animal.nome AS animal_nome,\n"
     + "animal.sexo AS animal_sexo,\n"
     + "animal.raca AS animal_raca,\n"
     + "animal.cor AS animal_cor,\n"
     + "animal.idade AS animal_idade,\n"
     + "animal.data_nascimento AS animal_data_nascimento,\n"
     + "animal.peso AS animal_peso,\n"
     + "animal.grau_sangue AS animal_grau_sangue,\n"
     + "animal.informacao AS animal_informacao,\n"
     + "leilao.cod_leilao AS leilao_cod_leilao,\n"
     + "leilao.tipo_de_leilao AS leilao_tipo_de_leilao,\n"
     + "leilao.data_leilao AS leilao_data_leilao,\n"
     + "leilao.valor_arrebatado AS leilao_valor_arrebatado,\n"
     + "leilao.local_realizacao AS leilao_local_realizacao,\n"
     + "leilao.informacao AS leilao_informacao\n"
     + "FROM\n"
     + "public.animal animal INNER JOIN public.saida saida ON animal.cod_animal = saida.cod_animal\n"
     + "INNER JOIN public.leilao leilao ON saida.cod_leilao = leilao.cod_leilao where cod_saida='" + cod + "'";
     relatorios.gerar_relatorio(relatorioSaidaIndividualLeilao, "C:/LEGADO/relatorios/producao/saida_leilao.jasper");
     break;
    
     case "relatorioGestantesIndividual":
     String relatorioGestantesIndividual = "select a.cod_animal,a.nome,a.cod_instituicao,c.pai,f.cod_fecundacao,f.data_fecundacao,g.cod_gestacao,g.previsao_parto,g.situacao,fe.descricao as categoria,cc.descricao from cruzamento c\n"
     + "join animal a on a.cod_animal=c.cod_animal_mae\n"
     + "join fecundacao f on f.cod_cruzamento=c.cod_cruzamento\n"
     + "join gestacao g on g.cod_fecundacao=f.cod_fecundacao \n"
     + "join fase fe on a.cod_fase=fe.cod_fase\n"
     + "join classificacao cc on cc.cod_classificacao=fe.cod_clasificacao where g.situacao='GESTANTE' and a.cod_animal not in (select cod_animal from saida) and g.cod_gestacao=" + cod;
     relatorios.gerar_relatorio(relatorioGestantesIndividual, "C:/LEGADO/relatorios/reproducao/vacas_gestantes.jasper");
     break;
     case "relatorioPartoIndividual":
     String relatorioPartoIndividual = "select c.pai,a.cod_instituicao,\n"
     + " a.cod_animal,a.nome as mae"
     + " ,cc.descricao as categoria\n"
     + " ,p.cod_parto\n"
     + " ,p.data_parto\n"
     + " ,p.quantidade_crias\n"
     + " ,p.informacoes\n"
     + " ,g.cod_gestacao \n"
     + " ,f.cod_fecundacao\n"
     + " ,c.cod_cruzamento \n"
     + " ,a.cod_animal\n"
     + " from parto p\n"
     + " \n"
     + " join gestacao g on g.cod_gestacao=p.cod_gestacao \n"
     + " join fecundacao f on f.cod_fecundacao=g.cod_fecundacao\n"
     + " join cruzamento c on c.cod_cruzamento=f.cod_cruzamento\n"
     + " join animal a on c.cod_animal_mae=a.cod_animal \n"
     + " join fase fe on a.cod_fase=fe.cod_fase\n"
     + " join classificacao cc on cc.cod_classificacao=fe.cod_clasificacao and a.cod_animal not in (select cod_animal from saida) and p.cod_parto=" + cod;
     relatorios.gerar_relatorio(relatorioPartoIndividual, "C:/LEGADO/relatorios/reproducao/partos.jasper");
     break;
    
     case "relatorioCruzamentoIndividual":
     String relatorioCruzamentoIndividual = "SELECT\n"
     + "cruzamento.cod_cruzamento AS cruzamento_cod_cruzamento,\n"
     + "cruzamento.cod_tipo_cruzamento AS cruzamento_cod_tipo_cruzamento,\n"
     + "cruzamento.cod_animal_mae AS cruzamento_cod_animal_mae,\n"
     + "cruzamento.crmv AS cruzamento_crmv,\n"
     + "cruzamento.data_cruza AS cruzamento_data_cruza,\n"
     + "cruzamento.pai AS cruzamento_pai,\n"
     + "cruzamento.tentativa AS cruzamento_tentativa,\n"
     + "cruzamento.status AS cruzamento_status,\n"
     + "animal.cod_animal AS animal_cod_animal,\n"
     + "animal.cod_instituicao AS animal_cod_instituicao,\n"
     + "animal.cod_origem AS animal_cod_origem,\n"
     + "animal.cod_fase AS animal_cod_fase,\n"
     + "animal.nome AS animal_nome,\n"
     + "animal.sexo AS animal_sexo,\n"
     + "animal.raca AS animal_raca,\n"
     + "animal.cor AS animal_cor,\n"
     + "animal.idade AS animal_idade,\n"
     + "animal.data_nascimento AS animal_data_nascimento,\n"
     + "animal.peso AS animal_peso,\n"
     + "animal.grau_sangue AS animal_grau_sangue,\n"
     + "animal.informacao AS animal_informacao,\n"
     + "veterinario.cod_veterinario AS veterinario_cod_veterinario,\n"
     + "veterinario.crmv AS veterinario_crmv,\n"
     + "veterinario.cpf AS veterinario_cpf,\n"
     + "veterinario.nome AS veterinario_nome,\n"
     + "veterinario.endereco AS veterinario_endereco,\n"
     + "veterinario.numero AS veterinario_numero,\n"
     + "veterinario.bairro AS veterinario_bairro,\n"
     + "veterinario.cidade AS veterinario_cidade,\n"
     + "veterinario.uf AS veterinario_uf,\n"
     + "veterinario.email AS veterinario_email,\n"
     + "veterinario.fone1 AS veterinario_fone1,\n"
     + "veterinario.fone2 AS veterinario_fone2,\n"
     + "veterinario.tipo_contrato AS veterinario_tipo_contrato,\n"
     + "veterinario.especialidade AS veterinario_especialidade,\n"
     + "tipo_cruzamento.cod_tipo_cruzamento AS tipo_cruzamento_cod_tipo_cruzamento,\n"
     + "tipo_cruzamento.descricao AS tipo_cruzamento_descricao,\n"
     + "tipo_cruzamento_A.cod_tipo_cruzamento AS tipo_cruzamento_A_cod_tipo_cruzamento,\n"
     + "tipo_cruzamento_A.descricao AS tipo_cruzamento_A_descricao\n"
     + "FROM\n"
     + "public.animal animal INNER JOIN public.cruzamento cruzamento ON animal.cod_animal = cruzamento.cod_animal_mae\n"
     + "INNER JOIN public.veterinario veterinario ON cruzamento.crmv = veterinario.crmv\n"
     + "INNER JOIN public.tipo_cruzamento tipo_cruzamento ON cruzamento.cod_tipo_cruzamento = tipo_cruzamento.cod_tipo_cruzamento\n"
     + "INNER JOIN public.tipo_cruzamento tipo_cruzamento_A ON cruzamento.cod_tipo_cruzamento = tipo_cruzamento_A.cod_tipo_cruzamento";
     relatorios.gerar_relatorio(relatorioCruzamentoIndividual, "C:/LEGADO/relatorios/reproducao/cruzamento.jasper");
     break;
    
     }
    
     }*/
}
