// Countdown to next BBQ date
const countdownElement = document.getElementById('countdown');
// Set your next BBQ date here (YYYY, MM-1, DD, HH, MM, SS)
const nextBBQ = new Date(2025, 5, 20, 12, 0, 0);

function updateCountdown() {
    const now = new Date();
    const diff = nextBBQ - now;
    if (diff <= 0) {
        countdownElement.textContent = 'BBQ is live!';
        clearInterval(intervalId);
        return;
    }
    const days = Math.floor(diff / (1000 * 60 * 60 * 24));
    const hours = Math.floor((diff / (1000 * 60 * 60)) % 24);
    const minutes = Math.floor((diff / 1000 / 60) % 60);
    const seconds = Math.floor((diff / 1000) % 60);
    countdownElement.textContent = `${days}d ${hours}h ${minutes}m ${seconds}s`;
}

const intervalId = setInterval(updateCountdown, 1000);
updateCountdown();