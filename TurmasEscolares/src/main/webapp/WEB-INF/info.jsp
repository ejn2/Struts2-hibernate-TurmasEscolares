<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="./css/info.css">
    <title>Info</title>
</head>
<body>
    <section class="root">
        <div class="info">
            <div class="content">
            <s:url action="remove" var="urlDel">
					<s:param name="id"><s:property value="id"/></s:param>
				</s:url>
                <s:a href="%{urlDel}"><button class="delete_turma">Excluir turma</button></s:a>
                <p class="titulo">Turma: <s:property value="turma.titulo"/></p>
                <button class="add add_prof">+ Novo Professor</button>
                <div class="show show-prof">
                    <p class="list_title">Professores</p>
                    
                    <s:iterator value="turma.professores">
	                    <div class='item'>
	                        <p class="item_title"><s:property value="nome"/></p>
	                        <div class="delete_item"></div>
	                    </div>
                    </s:iterator>
                </div>

                <button class="add add_aluno">+ Novo aluno</button>
                <div class="show show-aluno">
                    <p class="list_title">Alunos</p>
					
					<s:iterator value="turma.alunos">
	                    <div class='item'>
	                        <p class="item_title"><s:property value="nome"/></p>
	                        <div class="delete_item"></div>
	                    </div>
                    </s:iterator>
                </div>
            </div>
        </div>
        <div class="div-form">
            <button type="button" class="close_form"></button>
            <form class="form-save" method="post" action="">
				<h1 style="color: red;" >! AINDA NAO DISPONIVEL !</h1>
                <div class="form_field">
                    <h1 class="title_form"></h1>

                    <label class="label_form label_form_1"></label><br>
                    <input type="text" class="form_input_1"/><br>

                    <label class="label_form label_form_2"></label><br>
                    <input type="text" class="form_input_2"/>
                </div>

                <button type="button">Salvar</button>
            </form>
        </div>
    </section>
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="./js/jquery.validate.min.js"></script>
    <script src="./js/localization/messages_pt_BR.min.js"></script>
    <script src="./js/info.js"></script>
</body>
</html>