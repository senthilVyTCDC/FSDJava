document.getElementById('loginForm').addEventListener('submit', function(e) {
  e.preventDefault(); // Prevent actual form submission

  const email = document.getElementById('email');
  const password = document.getElementById('password');
  const emailError = document.getElementById('emailError');
  const passwordError = document.getElementById('passwordError');

  let isValid = true;

  // Reset errors
  emailError.style.display = 'none';
  passwordError.style.display = 'none';

  // Email validation
  const emailValue = email.value.trim();
  const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  if (!emailValue || !emailRegex.test(emailValue)) {
    emailError.style.display = 'block';
    isValid = false;
  }

  // Password validation
  const passwordValue = password.value.trim();
  if (!passwordValue) {
    passwordError.style.display = 'block';
    isValid = false;
  }

  if (isValid) {
    console.log('Email:', emailValue);
    console.log('Password:', passwordValue);
    alert('Login successful!');
  }
});
