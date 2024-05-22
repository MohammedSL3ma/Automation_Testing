# Automation_Testing:
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Selenium Test Automation</title>
</head>
<body>

<h1>Selenium Test Automation</h1>

<p>This repository contains Selenium-based test automation scripts for a web application, focusing on functionalities like account creation, product search, and adding products to the basket.</p>

<h2>Project Structure</h2>
<ul>
    <li><strong>PageBase</strong>: Base class with common methods and WebDriver setup.</li>
    <li><strong>HomePage</strong>: Interactions with the home page.</li>
    <li><strong>LoginPage</strong>: Handles login page actions.</li>
    <li><strong>CreateAccountPage</strong>: Manages account creation process.</li>
    <li><strong>SearchResultPage</strong>: Manages search results.</li>
    <li><strong>ShopProductsPage</strong>: Interacts with shop products.</li>
    <li><strong>AddToFavoritePage</strong>: Adds items to the favorite list.</li>
    <li><strong>AddToBasketPage</strong>: Adds products to the basket.</li>
    <li><strong>ProfilePage</strong>: Manages user profile actions.</li>
    <li><strong>TestBase</strong>: Sets up and tears down WebDriver for tests.</li>
    <li><strong>Test Classes</strong>: Specific tests for various functionalities.</li>
</ul>

<h2>Key Test Scenarios</h2>
<table border="1">
    <tr>
        <th>Method</th>
        <th>Description</th>
    </tr>
    <tr>
        <td>homePage.Open_login_page()</td>
        <td>Opens the login page.</td>
    </tr>
    <tr>
        <td>loginPage.Open_Create_Account_Page()</td>
        <td>Opens the account creation page.</td>
    </tr>
    <tr>
        <td>createAccountPage.add_data(...)</td>
        <td>Fills in user data for account creation.</td>
    </tr>
    <tr>
        <td>createAccountPage.submit_data()</td>
        <td>Submits the account creation form.</td>
    </tr>
    <tr>
        <td>createAccountPage.add_code(...)</td>
        <td>Adds verification code during account creation.</td>
    </tr>
    <tr>
        <td>loginPage.LogIn("email", "password")</td>
        <td>Logs in with provided credentials.</td>
    </tr>
    <tr>
        <td>homePage.search("bags")</td>
        <td>Searches for "bags" on the site.</td>
    </tr>
    <tr>
        <td>searchResultPage.open_first_product()</td>
        <td>Opens the first product in search results.</td>
    </tr>
    <tr>
        <td>shopProductsPage.get_silver_watches()</td>
        <td>Fetches a list of silver watches.</td>
    </tr>
    <tr>
        <td>homePage.Open_accessory_list()</td>
        <td>Opens the accessory list.</td>
    </tr>
    <tr>
        <td>addToFavoritePage.AddToFavorite()</td>
        <td>Adds an item to the favorite list.</td>
    </tr>
    <tr>
        <td>profilePage.open_my_favorite_list()</td>
        <td>Opens the user's favorite list in the profile.</td>
    </tr>
    <tr>
        <td>addToBasketPage.select_product()</td>
        <td>Selects a product to add to the basket.</td>
    </tr>
    <tr>
        <td>addToBasketPage.AddToBasket()</td>
        <td>Adds the selected product to the basket.</td>
    </tr>
    <tr>
        <td>addToBasketPage.openBasket()</td>
        <td>Opens the basket to view products.</td>
    </tr>
</table>

<h2>Wait vs. Sleep</h2>
<p>
    <strong>Thread.sleep(3000);</strong>: Pauses execution for a fixed time (3 seconds), can cause delays if the page loads faster.
</p>
<p>
    <strong>WebDriverWait</strong>: Waits for a condition to be met (e.g., element visibility), proceeds as soon as the condition is met, improving efficiency.
</p>

<h2>How to Run the Tests</h2>
<ol>
    <li>Clone the repository.</li>
    <li>Set up Java, Maven, and Selenium WebDriver.</li>
    <li>Run tests using TestNG:
        <pre><code>mvn test</code></pre>
    </li>
</ol>

<h2>License</h2>
<p>This project is licensed under the MIT License.</p>

</body>
</html>
