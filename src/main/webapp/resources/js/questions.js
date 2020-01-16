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

    getAnswers: function () {
        $.ajax({
            url: Questionwindow.API_BASE_URL + "/answers/",
            method: "GET"
        }).done(function (response) {
            console.log(response);
            Questionwindow.displayAnswer(response.content);
        })
    },



    displayQuestions: function(questions){
        var allQuestionsHtml = "";

        questions.forEach(question =>  allQuestionsHtml += Questionwindow.getHtml(question));
        $(".quizmain").html(allQuestionsHtml)

    },

    displayAnswer: function (answers) {
        var allAnswersHtml ="";

        answers.forEach(answer => allAnswersHtml += Questionwindow.getHtml(answer));
        $(".quizmain").html(allAnswersHtml);
    },

    getHtml: function(question,answer){
        return `<div class="quizmain">
                    <h3>Question ${question.id} of 10:</h3>
                        <table>
                           <tr>
                             <td class="question-content">
                               <a>${question.content}</a>
                             </td>
                             <td class="answer-content">
                                <a>${answer.content}</a>
                             </td>
                             </tr>
                        </table>
                 </div>`
    }
};
Questionwindow.getQuestions();
Questionwindow.getAnswers();

