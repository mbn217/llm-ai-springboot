const chatBox = document.getElementById('chatBox');
const chatForm = document.getElementById('chatForm');
const userInput = document.getElementById('userInput');

chatForm.addEventListener('submit', function (e) {
    e.preventDefault();
    const input = userInput.value.trim();
    if (!input) return;

    appendMessage('You', input, 'user-msg');
    userInput.value = '';

    fetch('/chat', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(input)
    })
    .then(res => res.text())
    .then(response => {
        appendMessage('Bot', response, 'bot-msg');
    })
    .catch(err => console.error('Error:', err));
});

function appendMessage(sender, text, className) {
    const msg = document.createElement('div');
    msg.className = className;
    msg.innerHTML = `<strong>${sender}:</strong> ${text}`;
    chatBox.appendChild(msg);
    chatBox.scrollTop = chatBox.scrollHeight;
}