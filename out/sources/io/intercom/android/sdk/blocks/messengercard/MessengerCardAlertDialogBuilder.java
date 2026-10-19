package io.intercom.android.sdk.blocks.messengercard;

import C7.g;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.app.e;
import androidx.core.view.O;
import androidx.core.view.Z;
import io.intercom.android.sdk.R;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
class MessengerCardAlertDialogBuilder extends e.a {
    public MessengerCardAlertDialogBuilder(Context context, Map<String, Object> map, int i10, WebView webView) {
        super(context);
        setUp(context, map, i10, webView);
    }

    private void setUp(Context context, final Map<String, Object> map, int i10, final WebView webView) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.intercom_webview_card_input, (ViewGroup) null, false);
        setTitle((CharSequence) map.get("label"));
        final AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) viewInflate.findViewById(R.id.input);
        autoCompleteTextView.setText((CharSequence) map.get("currentValue"));
        autoCompleteTextView.setHint((CharSequence) map.get("placeholder"));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i10);
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        O.d.q(autoCompleteTextView, colorStateListValueOf);
        setView(viewInflate);
        setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.blocks.messengercard.MessengerCardAlertDialogBuilder.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i11) {
                MessengerCardAlertDialogBuilder.this.sendResultToWebview(webView, autoCompleteTextView.getText().toString(), map);
                ((InputMethodManager) autoCompleteTextView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(autoCompleteTextView.getWindowToken(), 0);
                dialogInterface.dismiss();
            }
        });
        setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.blocks.messengercard.MessengerCardAlertDialogBuilder.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i11) {
                ((InputMethodManager) autoCompleteTextView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(autoCompleteTextView.getWindowToken(), 0);
                dialogInterface.cancel();
            }
        });
    }

    public void sendResultToWebview(WebView webView, String str, Map<String, Object> map) {
        String strReplaceAll;
        try {
            strReplaceAll = URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            strReplaceAll = "";
        }
        StringBuilder sbA = g.a("window.fallbackApp.bridgeEvent('UPDATE_TEXT', { value:'", strReplaceAll, "', id:'");
        sbA.append(map.get("id"));
        sbA.append("'})");
        webView.evaluateJavascript(sbA.toString(), null);
    }
}
