document.getElementById('submitVote').addEventListener('click', function() {
    // Get selected party
    var selectedParty = document.querySelector('input[name="party"]:checked');
    
    // Get user input values
    var nameInput = document.getElementById('nameInput').value;
    var phoneInput = document.getElementById('phoneInput').value;

    // Check if a party is selected and name and phone are entered
    if (selectedParty && nameInput && phoneInput) {
        var party = selectedParty.value;
        
        // Here you can send the vote data to the server for processing
        // For demonstration, let's just display the result
        var resultMessage = 'Thank you, ' + nameInput + '! Your vote for Party ' + party + ' is submitted.';
        document.getElementById('result').innerText = resultMessage;

        // Show the result box
        var resultBox = document.getElementById('resultBox');
        resultBox.style.display = 'block';
    } else {
        alert('Please fill in all the fields and select a party.');
    }
});

document.getElementById('checkResult').addEventListener('click', function() {
    var resultBox = document.getElementById('resultBox');
    resultBox.style.display = 'block';
    // Here you can implement the functionality to check the result from the server
    // For demonstration, let's just display a placeholder message
    var resultMessage = 'Election results will be available soon.';
    document.getElementById('result').innerText = resultMessage;
});

document.getElementById('closeResult').addEventListener('click', function() {
    var resultBox = document.getElementById('resultBox');
    resultBox.style.display = 'none';
});
