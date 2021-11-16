$(".form-register").validate({
    rules: {
        "turma.titulo": { required: true, minlength: 3, maxlength: 15},
        "prof.nome": { required: true, minlength: 3, maxlength: 15},
        "materia.titulo": { required: true, minlength: 3, maxlength: 15},
        "aluno.nome": { required: true, minlength: 3, maxlength: 15},
        "aluno.sobrenome": { required: true, minlength: 3, maxlength: 15},
    }
});

$("#turma.titulo-error").css({
	"font-size": "300px"
})