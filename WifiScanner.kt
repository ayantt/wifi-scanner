package wifi.scanner // Replace with your actual package name

import android.content.Context
import android.net.wifi.WifiManager
import android.util.Log

class WifiScanner(private val context: Context) {

    fun getSSIDs(): List<String> {
        val wifiManager = context.applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager
        val scanResults = wifiManager.scanResults
        val ssids = scanResults.map { it.SSID }
        
        Log.d("WiFiScanner", "SSIDs found: $ssids")
        return ssids
    }
}
