function alunoForm() {

    //Titulo
    $(".title_form").text("Novo Aluno");

    //Label Nome
    $(".label_form_1").attr({ for: "aluno_nome" }).text("Nome do Aluno");
    //Input Nome
    $(".form_input_1").attr({ id: "aluno_nome", placeholder: "Nome do Aluno", name: "nome_aluno" });

    //Label Sobrenome
    $(".label_form_2").attr({ for: "aluno_sobrenome" }).text("Sobrenome");

    //Input Sobrenome
    $(".form_input_2").attr({ id: "aluno_sobrenome", placeholder: "Sobrenome", name: "nome_sobrenome" });

    //Action
    $(".form-save").attr({ action: "savealuno" });
}


function professorForm() {

    //Titulo
    $(".title_form").text("Novo Professor");

    //Label Nome
    $(".label_form_1").attr({ for: "prof_nome" }).text("Nome do Professor");

    //Input Nome
    $(".form_input_1").attr({ id: "prof_nome", placeholder: "Nome do Professor", name: "nome_professor" });

    //Label Materia
    $(".label_form_2").attr({ for: "titulo_materia" }).text("Materia");

    //Input Materia
    $(".form_input_2").attr({ id: "titulo_materia", placeholder: "Materia", name: "titulo_materia" });

    //Action
    $(".form-save").attr({ action: "saveprof" });
}


//OPEN FORM ALUNO
$(".add_aluno").click(() => {
    $(".div-form").css({width: "350px"});
    $(".form-save").css({ display: "flex" });

    //ADD ACTION FORM
    alunoForm()
});

//CLOSE FORM
$(".close_form").click(() => {
    $(".div-form").css({width: "0px"});
});

//ABRE FORM PROFESSOR
$(".add_prof").click(() => {
    $(".div-form").css({width: "350px"});
    $(".form-save").css({ display: "flex" });

    //ADD ACTION FORM
    professorForm();
});