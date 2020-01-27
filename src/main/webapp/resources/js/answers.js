contextPath = undefined;
window.Answerwindow ={
    API_BASE_URL: "http://localhost:8085",

    getQuestions: function () {
        $.ajax({
            url: Answerwindow.API_BASE_URL + "/questions/",
            method: "GET"
        }).done(function (response) {
            console.log(response);
            Answerwindow.displayQuestion(response.content);
        })
    },



    displayQuestion: function (questions) {
        var allQuestionsHtml ="";

        questions.forEach(question => allQuestionsHtml += Answerwindow.getHtml(question));
        $(".quizmain").html(allQuestionsHtml);

    },

    getHtml: function (question) {
        return `           
                 <ul class="question-list" type="1">
                     <li>
                        <span> ${question.id}. ${question.title} </span>
                        <input type="hidden" name="questionId" value="${question.id}">
                       <ol type="a">
                      
                      <li>                          
                        ${question.answer1}
                        <input type="radio" name="question_${question.id}" value="${question.answer1}">
                       </li>
                       <li>
                        ${question.answer2}
                        <input type="radio" name="question_${question.id}" value="${question.answer2}">
                       </li>
                       <li>
                         ${question.answer3}
                         <input type="radio" name="question_${question.id}" value="${question.answer3}">
                       </li>
                       </ol>
                     </li>
                  </ul>
                `
    },


};

Answerwindow.getQuestions();