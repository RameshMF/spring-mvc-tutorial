<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <!DOCTYPE html>

    <html>

    <head><%@ page isELIgnored="false" %>
        <title>Customer Confirmation</title>
    </head>

    <body>

        The customer is confirmed: ${customer.firstName} ${customer.lastName}

        <br><br> Free passes: ${customer.freePasses}

        <br><br> Email: ${customer.email}

        <br><br> Postal Code: ${customer.postalCode}

    </body>

    </html>