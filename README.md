# KMeans
An implementation of k-means clustering on a training data set to predict classification values of a test data set.

![test workflow](https://github.com/karimtabet/K-Means/actions/workflows/test.yml/badge.svg) ![codeql workflow](https://github.com/karimtabet/kmeans/actions/workflows/codeql-analysis.yml/badge.svg) ![issues](https://img.shields.io/github/issues/karimtabet/kmeans) ![forks](https://img.shields.io/github/forks/karimtabet/kmeans) ![stars](https://img.shields.io/github/stars/karimtabet/kmeans) ![license](https://img.shields.io/github/license/karimtabet/kmeans)

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