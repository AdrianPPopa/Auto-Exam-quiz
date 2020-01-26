window.Answerwindow ={
    API_BASE_URL: "http://localhost:8085",

    getQuestions: function () {
        $.ajax({
            url: Answerwindow.API_BASE_URL + "/questions/" + "/answers",
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

    displayAnswer: function (answers){
        var allAnswersHtml = "";

        answers.forEach(answer => allAnswersHtml =+ Answerwindow.getHtml(answer));
        $(".quizmain").html(allAnswersHtml);
        console.log(allAnswersHtml);
    },

    getHtml: function (question) {
        return `<div class="quizmain">
                 <h3></h3>
                
                 <ol type ="1">
                     <li>
                        ${question.content}
                       <ol type="a">
                       <c:foreach var="answer" items="${question.displayAnswer(answers)}"
                      <li> 
                       </li>
                        </ol>
                     </li>
                  </ol>
            </div>`
    }
};

Answerwindow.getQuestions();