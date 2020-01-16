// window.Answerwindow ={
//     API_BASE_URL: "http://localhost:8085",
//
//     getAnswers: function () {
//         $.ajax({
//             url: Answerwindow.API_BASE_URL + "/answers/",
//             method: "GET"
//         }).done(function (response) {
//             console.log(response);
//             Answerwindow.displayAnswer(response.content);
//         })
//     },
//
//     displayAnswer: function (answers) {
//         var allAnswersHtml ="";
//
//         answers.forEach(answer => allAnswersHtml += Answerwindow.getAnswerHtml(answer));
//         $(".quizmain").html(allAnswersHtml);
//     },
//
//     getAnswerHtml: function (answer) {
//         return `<div class="quizmain">
//                     <h3></h3>
//                         <table>
//                            <tr>
//                              <td class="question-content">
//                                <a></a>
//                              </td>
//                              <td class="answer-content">
//                                 <a>${answer.content}</a>
//                              </td>
//                              </tr>
//                         </table>
//                  </div>`
//     }
// };
//
// Answerwindow.getAnswers();