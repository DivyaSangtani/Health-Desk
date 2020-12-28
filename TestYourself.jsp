
<jsp:include page='MasterPageTopSection.jsp' />  


</nav>
 <form id="formid" method="POST" action="../healthdesk/Servlet/TestingYourself.java">
        <div id="result"></div>
        <div class="container mt-5">
            <div class="d-flex justify-content-center row">
                <div class="col-md-10 col-lg-10">
                    <div class="border">
                        <div class="question bg-white p-3 border-bottom">
                            <div class="d-flex flex-row justify-content-between align-items-center mcq">
                                <h4>Test Yourself</h4><span>Are you Safe?</span>
                            </div>
                        </div>
                        <div class="question bg-white p-3 border-bottom">
                            <div class="d-flex flex-row align-items-center question-title">
                                <h3 class="text-danger">Q.</h3>
                                <h5 class="mt-1 ml-2">Are you experiencing any of the following symptoms?</h5>
                            </div>
                            <div class="ans ml-2">
                                <label class="radio"> <input type="radio" onclick="fun()" id="cough" name="Cough" value="Cough"> <span>Cough</span>
                        </label>
                            </div>
                            <div class="ans ml-2">
                                <label class="radio"> <input type="radio" onclick="fun()" id="fever" name="Fever" value="Fever"> <span>Fever</span>
                        </label>
                            </div>
                            <div class="ans ml-2">
                                <label class="radio"> <input type="radio" onclick="fun()" id="difficulty" name="DifficultyInBreathing" value="DifficultyInBreathing"> <span>Difficulty in Breathing</span>
                        </label>
                            </div>
                            <div class="ans ml-2">
                                <label class="radio"> <input type="radio" onclick="fun()" id="noa" name="NoneOfTheAbove1" value="NoneOfTheAbove"> <span>None of the Above</span>
                        </label>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="container mt-5">
            <div class="d-flex justify-content-center row">
                <div class="col-md-10 col-lg-10">
                    <div class="border">
                        <div class="question bg-white p-3 border-bottom">
                            <div class="d-flex flex-row justify-content-between align-items-center mcq">

                            </div>
                        </div>

                        <div class="question bg-white p-3 border-bottom">
                            <div class="d-flex flex-row align-items-center question-title">
                                <h3 class="text-danger">Q.</h3>
                                <h5 class="mt-1 ml-2">Have you ever had any one of the following:</h5>
                            </div>
                            <div class="ans ml-2">
                                <label class="radio"> <input type="radio" name="Diabetes" value="Diabetes"> <span>Diabetes</span>
                        </label>
                            </div>
                            <div class="ans ml-2">
                                <label class="radio"> <input type="radio" name="Hypertension" value="Hypertension"> <span>Hypertension</span>
                        </label>
                            </div>
                            <div class="ans ml-2">
                                <label class="radio"> <input type="radio" name="LungDisease" value="LungDisease"> <span>Lung disease</span>
                        </label>
                            </div>
                            <div class="ans ml-2">
                                <label class="radio"> <input type="radio" name="HeartDisease" value="HeartDisease"> <span>Heart disease</span>
                        </label>
                            </div>
                            <div class="ans ml-2">
                                <label class="radio"> <input type="radio" name="NoneOfTheAbove" value="NoneOfTheAbove"> <span>None of the Above</span>
                        </label>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>

        <div class="container mt-5">
            <div class="d-flex justify-content-center row">
                <div class="col-md-10 col-lg-10">
                    <div class="border">
                        <div class="question bg-white p-3 border-bottom">
                            <div class="d-flex flex-row justify-content-between align-items-center mcq">
                                <div class="question bg-white p-3 border-bottom">
                                    <div class="d-flex flex-row align-items-center question-title">
                                        <h3 class="text-danger">Q.</h3>
                                        <h5 class="mt-1 ml-2">Have you travelled anywhere internationally in the last14 days?</h5>
                                    </div>
                                    <div class="ans ml-2">
                                        <label class="radio"> <input type="radio" name="Yes" value="Yes"> <span>Yes</span>
                        </label>
                                    </div>
                                    <div class="ans ml-2">
                                        <label class="radio"> <input type="radio" name="No" value="No"> <span>No</span>
                        </label>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="container mt-5">
                    <div class="d-flex justify-content-center row">
                        <div class="col-md-10 col-lg-10">
                            <div class="border">
                                <div class="question bg-white p-3 border-bottom">
                                    <div class="d-flex flex-row justify-content-between align-items-center mcq">
                                        <div class="question bg-white p-3 border-bottom">
                                            <div class="d-flex flex-row align-items-center question-title">
                                                <h3 class="text-danger">Q.</h3>
                                                <h5 class="mt-1 ml-2">Which of the following applies to you?</h5>
                                            </div>
                                            <div class="ans ml-2">
                                                <label class="radio"> <input type="radio" name="Interacted" value="Interacted"> <span>I have recently interacted or lived with someone who has tested positive for COVID-19</span>
                        </label>
                                            </div>
                                            <div class="ans ml-2">
                                                <label class="radio"> <input type="radio" name="HealthcareWorker" value="HealthcareWorker"> <span>I am a healthcare worker and I examined a COVID-19 confirmed case without protective gear.</span>
                        </label>
                                            </div>


                                            <div class="ans ml-2">
                                                <label class="radio"> <input type="radio" name="NoneOfTheAbove" value="NoneOfTheAbove"> <span>None of the Above</span>
                        </label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <br>
                    <div class="container my-3 bg-light">
                        <div class="col-md-12 text-center">
                            <a href="#" class="btn btn-info" onclick="Check(event)" type="submit" role="button">Submit</a>
                            <a href="testingYourself.html" class="btn btn-info" role="button">Cancel</a>
                        </div>
                    </div>
                    <br><br>
</body>
</form>
<jsp:include page='/MasterPageBottomSection.jsp'/>