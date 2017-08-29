# Mzip-Android
An Android compress and extract library support popular compression format such as rar, zip, tar, lzma

# ABOUT The LIBRARY....

The simple and useful library for android app developers to read/write archives like zip , rar , tar , tar.gz, tar.bz2.
I needed compressing files for a project, Because I could not find a good and thorough library I wrote a nearly complete library.
Other open source projects have been used to write this library.

# Supported formats
.zip
.tar
.tar.gz & .tgz
.tar.bz2 & .tbz2
.tar.xz & .txz
.tar.lz4 & .tlz4
.tar.sz & .tsz
.rar

# Download
You can use Gradle:
```gradle
repositories {
 maven { url 'https://jitpack.io' }
}

dependencies {
  compile 'com.github.ghost1372:Mzip-Android:0.2.0'
}
```
Or Maven:
# Step 1. Add the JitPack repository to your build file
```xml
<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```
# Step 2. Add the dependency
```xml
<dependency>
	    <groupId>com.github.ghost1372</groupId>
	    <artifactId>Mzip-Android</artifactId>
	    <version>0.2.0</version>
	</dependency>
```
# How do I use MZip?
# Mzip-Android
An Android compress and extract library support popular compression format such as rar, zip, tar, lzma

# ABOUT The LIBRARY....

The simple and useful library for android app developers to read/write archives like zip , rar , tar , tar.gz, tar.bz2.
I needed compressing files for a project, Because I could not find a good and thorough library I wrote a nearly complete library.
Other open source projects have been used to write this library.

# Supported formats
.zip
.tar
.tar.gz & .tgz
.tar.bz2 & .tbz2
.tar.xz & .txz
.tar.lz4 & .tlz4
.tar.sz & .tsz
.rar

# Download
You can use Gradle:
```gradle
repositories {
 maven { url 'https://jitpack.io' }
}

dependencies {
  compile 'com.github.ghost1372:Mzip-Android:0.3.0'
}
```
Or Maven:
# Step 1. Add the JitPack repository to your build file
```xml
<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```
# Step 2. Add the dependency
```xml
<dependency>
	    <groupId>com.github.ghost1372</groupId>
	    <artifactId>Mzip-Android</artifactId>
	    <version>0.3.0</version>
	</dependency>
```
# How do I use MZip?
Zip:
```java
ZipArchive zipArchive = new ZipArchive();
zipArchive.zip(targetPath,destinationPath,password);

//Example
ZipArchive zipArchive = new ZipArchive();
zipArchive.zip("/sdcard/file.pdf","/sdcard/file.zip,"");
//if you want protect with password
zipArchive.zip("/sdcard/file.pdf","/sdcard/file.zip,"123456 or anything you want");
```
Unzip
```java
ZipArchive zipArchive = new ZipArchive();
zipArchive.unzip(targetPath,destinationPath,password);

//Example
ZipArchive zipArchive = new ZipArchive();
zipArchive.unzip("/sdcard/file.zip","/sdcard/folder,"");
//if your file protected with password
zipArchive.unzip("/sdcard/file.zip","/sdcard/folder,"123456 or anything you want");
```
If your file does not have a password, Leave it blank.
<br>
Rar:

