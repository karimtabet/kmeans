# K-Means
An implementation of k-means clustering on a training data set to predict classification values of a test data set.

## Usage
Build:```mvn clean install```

Run:```mvn compile exec:java```

Test: ```mvn clean test```

## Configuration
A `classifieddata.txt` file and an `unclassifieddata.txt` file exist at `src/main/resources`.
Data in those files can be updated and must remain in the same format.

## Todo
* Pass input files as parameters
* Pass number of centroids as parameter
* More unit tests