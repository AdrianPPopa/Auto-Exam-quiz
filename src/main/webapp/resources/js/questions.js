window.Questionwindow = {
    API_BASE_URL: "http://localhost:8085",

    getQuestions: function () {
        $.ajax({
            url: Questionwindow.API_BASE_URL + "/questions/",
            method: "GET"
        }).done(function (response) {
            console.log(response);
            Questionwindow.displayQuestions(response.content);
        })
    },

    displayQuestions: function(questions){
        var allQuestionsHtml = "";

        questions.forEach(question =>  allQuestionsHtml += Questionwindow.getQuestionHtml(question));
        $(".single-question-area").html(allQuestionsHtml)

    },

    getQuestionHtml: function(question){
        return `<div class="single-question-area">
                <table>
                  <tr>
                     <td class="question-content">
                      <a> ${question.content}</a>
                     </td>
                  </tr>
                </table>
                </div>`
    }
};
Questionwindow.getQuestions();

