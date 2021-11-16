<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="./css/style.css">
    <title>Home</title>
</head>
<body>
    <section class="root">
        <nav class="bar">
            <main id="center-80">
                <h1 class="main-title">Turmas Escolares</h1>
            </main>
        </nav>
        <div class="div-form">
            <div class="close-form"></div>
            
            <form class="form-register" action="save" method="post">
                    <h1 class="title-form">Criar nova Turma</h1>

                <div class="form-input">
                    <p class="title-info">Turma</p><br><br>
                        <s:textfield placeholder="Nome para a Turma" name="turma.titulo" /><br>

                </div>
                <div class="form-input form-input-prof">
                    <p class="title-info">Professor</p><br><br>
                    <s:textfield placeholder="Nome do Professor" name="prof.nome" />
                    <s:textfield placeholder="Materia" name="materia.titulo" />
                    <div class="add-novo add-prof"></div>

                </div>
                <div class="form-input form-input-aluno">
                    <p class="title-info">Aluno</p><br><br>
                    <s:textfield placeholder="Nome do Aluno" name="aluno.nome" />
                    <s:textfield placeholder="Sobrenome" name="aluno.sobrenome" />
                    <div class="add-novo add-aluno"></div>

                </div>
                <div class="form-input">
                    <button type="submit" id="btn-submit">Salvar</button>
                    
                </div>
            </form>
        </div>
        <div class="btn-novo" title="Criar nova turma"></div>
        <div class="show-turmas">
            <main id="center-60">
			
			<s:iterator value="turmaList">
				<s:url action="remove" var="urlDel">
					<s:param name="id"><s:property value="id"/></s:param>
				</s:url>
				<s:url action="save" var="urlEdit">
					<s:param name="id"><s:property value="id"/></s:param>
				</s:url>
	                <div class="turma">
	                <s:url action="info" var="infoPath">
	               		<s:param name="id"><s:property value="id"/></s:param>
	                 </s:url>
	                   <s:a href="%{infoPath}"><h1 class="turma-title"><s:property value="titulo"/></h1></s:a>
	                    	<s:a href="%{urlDel}" id="trash"><div class="trash controller"></div></s:a>
	                    	<s:a href="%{urlEdit}"  id="edit"><div class="edit controller"></div></s:a>
	                </div>
                </s:iterator>
            </main>
        </div>
    </section>
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="./js/jquery.validate.min.js"></script>
    <script src="./js/localization/messages_pt_BR.min.js"></script>
    <script src="./js/validations.js"></script>
    <script src="./js/main.js"></script>
</body>
</html>