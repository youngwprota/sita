<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template match="/order">
        <html>
        <body>
            <h2>Order Summary</h2>
            <p><strong>Customer Name:</strong> <xsl:value-of select="customer/name"/></p>
            <h3>Items:</h3>
            <ul>
                <xsl:for-each select="items/item">
                    <li>
                        <xsl:value-of select="name"/> - 
                        Quantity: <xsl:value-of select="quantity"/> 
                        (Price: $<xsl:value-of select="price"/>)
                    </li>
                </xsl:for-each>
            </ul>
            <p><strong>Total:</strong> $<xsl:value-of select="total"/></p>
            <p><strong>Date:</strong> <xsl:value-of select="orderDate"/></p>
        </body>
        </html>
    </xsl:template>
</xsl:stylesheet>