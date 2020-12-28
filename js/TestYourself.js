function Check() {
    let cough = document.getElementsByName("Cough")
    let fever = document.getElementsByName("Fever")
    let dib = document.getElementsByName("DifficultyInBreathing")
    let noa = document.getElementsByName("NoneOfTheAbove1")


if (cough.checked == true || fever.checked != true || dib.checked != true || noa.checked != true)
        alert("Low Risk")
if (cough.checked ! == true || fever.checked = true || dib.checked != true || noa.checked != true)
        alert("Low Risk")
if (cough.checked! == true || fever.checked != true || dib.checked = true || noa.checked != true)
        alert("Low Risk")
if (cough.checked ! == true || fever.checked != true || dib.checked != true || noa.checked = true)
        alert("Low Risk")

}

