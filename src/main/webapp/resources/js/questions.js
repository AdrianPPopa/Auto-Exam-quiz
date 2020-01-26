// ;window.Questionwindow = {
//     API_BASE_URL: "http://localhost:8085",
//
//     getQuestionsAndAnswers: function () {
//         $.ajax({
//             url: Questionwindow.API_BASE_URL + "/questions/",
//             method: "GET"
//         }).done(function (questionResponse) {
//             Questionwindow.displayQuestions(questionResponse.content);
//
//         });
//         $.ajax({
//             url: Questionwindow.API_BASE_URL + "/answers/",
//             method: "GET"
//         }).done(function (answerResponse) {
//             Questionwindow.displayAnswer(answerResponse.content);
//
//         });
//     },
//
//
//     displayQuestions: function(questions){
//         var allQuestionsHtml = "";
//
//         for (var i = 0; i < questions.length; i++) {
//             console.log(questions[i].content);
//             allQuestionsHtml += questions[i].content + "<br>";
//         }
//         $(".question-content").html(allQuestionsHtml);
//
//     },
//
//     displayAnswer: function (answers) {
//         var allAnswersHtml = "";
//
//         for (var i = 0; i < answers.length; i++) {
//             allAnswersHtml += answers[i].content + "<br>";
//             console.log(answers[i]);
//         }
//         $(".answer-content").html(allAnswersHtml);
//     },
//
//     getHtml: function(question, answer){
//         $('.quizmain').html(question);
//         return `<div class="quizmain">
//                     <h3>Question ${question.id} of 10:</h3>
//                         <table>
//                            <tr>
//                              <td class="question-content">
//                                <a>${question.content}</a>
//                              </td>
//                              <td class="answer-content">
//                                 <a>"${questions.answer}"</a>
//                              </td>
//                              </tr>
//                         </table>
//                  </div>`
//     }
// };
// Questionwindow.getQuestionsAndAnswers();


