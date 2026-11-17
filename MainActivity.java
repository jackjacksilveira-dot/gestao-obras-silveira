package br.com.silveira.gestaoobras;
import android.app.Activity; import android.os.Bundle; import android.webkit.*; import android.content.*; import android.net.Uri;
public class MainActivity extends Activity {
 private WebView web; private ValueCallback<Uri[]> chooser; private static final int PICK=71;
 @Override public void onCreate(Bundle b){super.onCreate(b); web=new WebView(this); setContentView(web); WebSettings s=web.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); s.setAllowFileAccess(true); s.setAllowContentAccess(true); web.setWebViewClient(new WebViewClient()); web.setWebChromeClient(new WebChromeClient(){@Override public boolean onShowFileChooser(WebView v,ValueCallback<Uri[]> cb,FileChooserParams p){if(chooser!=null)chooser.onReceiveValue(null);chooser=cb;try{startActivityForResult(p.createIntent(),PICK);return true;}catch(Exception e){chooser=null;return false;}}}); web.loadUrl("file:///android_asset/index.html"); }
 @Override protected void onActivityResult(int r,int c,Intent d){super.onActivityResult(r,c,d);if(r==PICK&&chooser!=null){chooser.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(c,d));chooser=null;}}
 @Override public void onBackPressed(){if(web!=null&&web.canGoBack())web.goBack();else super.onBackPressed();}
}
