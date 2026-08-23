// Get the registration form
const form = document.getElementById("registrationForm");

// Get the success message
const successMessage = document.getElementById("successMessage");


// When the user clicks Submit
form.addEventListener("submit", function(event) {

    // Prevent the page from refreshing
    event.preventDefault();

    // Display successful registration message
    successMessage.style.display = "block";

    // Scroll to the success message
    successMessage.scrollIntoView({
        behavior: "smooth"
    });

});