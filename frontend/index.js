window.addEventListener("DOMContentLoaded", function () {
  // Get the DOM elements
  var nameInput = document.getElementById("name");
  var emailInput = document.getElementById("email");
  var notificationsCheckbox = document.getElementById("notifications");
  var themeSelect = document.getElementById("theme");

  // Set initial values
  nameInput.value = "John Doe";
  emailInput.value = "johndoe@example.com";

  // Add event listeners
  notificationsCheckbox.addEventListener("change", function () {
    if (notificationsCheckbox.checked) {
      console.log("Notifications enabled");
    } else {
      console.log("Notifications disabled");
    }
  });

  themeSelect.addEventListener("change", function () {
    var selectedTheme = themeSelect.value;
    document.body.className = "theme-" + selectedTheme;
  });
});
