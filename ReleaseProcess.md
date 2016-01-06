# Introduction #

Follow these steps to release a new version of XM4WAS.

  1. Ensure that the sources are up-to-date:
```
svn update
```
  1. Set project version to release version with the Tycho Versions plugin:
```
mvn org.eclipse.tycho:tycho-versions-plugin:set-version -DnewVersion=0.1.0
```
  1. Build the project:
```
mvn clean install
```
  1. If the build succeeds, commit the changed files:
```
svn commit -m "prepare for release"
```
  1. Create a release tag:
```
svn update
svn copy . https://xm4was.googlecode.com/svn/tags/0.1.0 -m "created tag for 0.1.0"
```
  1. Upload the distribution to [Bintray](https://bintray.com/pvdbosch/generic/xm4was)
  1. Increment to next development version
```
mvn org.eclipse.tycho:tycho-versions-plugin:set-version -DnewVersion=0.2.0-SNAPSHOT
```
  1. Commit the changes:
```
svn commit -m "increment to next development version"
```