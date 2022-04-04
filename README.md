<h1 align="center">Network4K</h1>

<p align="center">A library for networking in Kotlin.</p>

<div align="center">
    <a href="https://discord.gg/invite/5UmsQP4MFH"><img src="https://img.shields.io/discord/610120595765723137?logo=discord" alt="Discord"/></a>
    <br><br>
    <img src="https://img.shields.io/github/last-commit/Lyzev/Network4K" alt="GitHub last commit"/>
    <img src="https://img.shields.io/github/commit-activity/w/Lyzev/Network4K" alt="GitHub commit activity"/>
    <br>
    <img src="https://img.shields.io/github/languages/code-size/Lyzev/Network4K" alt="GitHub code size in bytes"/>
    <img src="https://img.shields.io/github/contributors/Lyzev/Network4K" alt="GitHub contributors"/>
</div>

## Usage

[![](https://jitpack.io/v/Lyzev/Network4K.svg?label=Release)](https://jitpack.io/#Lyzev/Network4K)

### Import

Replace `${version}` with the current version!

<details>
        <summary>Gradle KTS</summary>

```kt
repositories {
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.Lyzev:Network4K:${version}")
}
```

</details>

<details>
        <summary>Gradle Groovy</summary>

```groovy
repositories {
	maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.Lyzev:Network4K:${version}'
}
```

</details>

<details>
        <summary>Maven</summary>

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.Lyzev</groupId>
        <artifactId>Network4K</artifactId>
        <version>${version}</version>
    </dependency>
</dependencies>
```

</details>

<details>
        <summary>Raw Jar</summary>

1. Go to the [release page](https://github.com/Lyzev/Network4K/releases).
2. Download Network4K-${version}.jar.
3. Add the jar to your classpath.

</details>

### Example

<details>
        <summary>HTTP/HTTPS</summary>

<details>
        <summary>Kotlin</summary>

```kt
val response = HttpClient.request(HttpMethod.GET, "https://www.google.com")
println(response)
```
</details>

<details>
        <summary>Java</summary>

```java
HttpResponse response = HttpClient.request(HttpMethod.GET, "https://www.google.com");
System.out.println(response);
```
</details>
</details>

## Documentation

You can find the documentation [here](https://lyzev.github.io/Network4K/dokka).

## Code Quality Monitoring

You can find the qodana report [here](https://lyzev.github.io/Network4K/qodana).

## Bugs and Suggestions
Bug reports and suggestions should be made in this repo's [issue tracker](https://github.com/Lyzev/Network4K/issues) using the templates provided. Please provide as much information as you can to best help us understand your issue and give a better chance of it being resolved.

## Important
Write here a note/something important.
