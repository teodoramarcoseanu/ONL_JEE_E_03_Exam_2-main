fetch('https://fer-api.coderslab.pl/v1/be-exam/movies')
  .then(response => response.json())
  .then(data => {

    console.log(data);


    const movieList = document.getElementById('movie-list');


    data.forEach(movie => {

      const titleElement = document.createElement('h2');
      titleElement.textContent = movie.title;


      const yearElement = document.createElement('h3');
      yearElement.textContent = movie.year;


      movieList.appendChild(titleElement);
      movieList.appendChild(yearElement);
    });
  })
  .catch(error => {
    console.error('Error loading movies:', error);
  });