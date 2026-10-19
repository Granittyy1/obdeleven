package io.intercom.android.sdk.m5.inbox;

import android.net.Uri;
import androidx.compose.foundation.C0936h;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import kotlin.text.Regex;
import kotlin.text.e;
import kotlin.text.g;
import p141l2.z;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39297c;

    public /* synthetic */ a(int i10, Object obj) {
        this.f39296b = i10;
        this.f39297c = obj;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f39296b) {
            case 0:
                return InboxViewModel.inboxPagingData$lambda$0((InboxViewModel) this.f39297c);
            default:
                z zVar = (z) this.f39297c;
                zVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) zVar.f44331e.getValue()).booleanValue()) {
                    String str = zVar.f44327a;
                    Uri uri = Uri.parse(str);
                    i.d(uri, "parse(...)");
                    for (String str2 : uri.getQueryParameterNames()) {
                        StringBuilder sb2 = new StringBuilder();
                        List<String> queryParameters = uri.getQueryParameters(str2);
                        int i10 = 1;
                        if (queryParameters.size() > 1) {
                            throw new IllegalArgumentException(C0936h.d("Query parameter ", str2, " must only be present once in ", str, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                        }
                        String str3 = (String) q.P(queryParameters);
                        if (str3 == null) {
                            zVar.f44333g = true;
                            str3 = str2;
                        }
                        g gVarB = Regex.b(z.f44322n, str3);
                        z.a aVar = new z.a();
                        int i11 = 0;
                        while (gVarB != null) {
                            e eVarK = gVarB.f43153c.k(i10);
                            i.b(eVarK);
                            aVar.f44339b.add(eVarK.f43149a);
                            if (gVarB.a().f4687b > i11) {
                                String strSubstring = str3.substring(i11, gVarB.a().f4687b);
                                i.d(strSubstring, "substring(...)");
                                String strQuote = Pattern.quote(strSubstring);
                                i.d(strQuote, "quote(...)");
                                sb2.append(strQuote);
                            }
                            sb2.append("([\\s\\S]+?)?");
                            i11 = gVarB.a().f4688c + 1;
                            gVarB = gVarB.b();
                            i10 = 1;
                        }
                        if (i11 < str3.length()) {
                            String strSubstring2 = str3.substring(i11);
                            i.d(strSubstring2, "substring(...)");
                            String strQuote2 = Pattern.quote(strSubstring2);
                            i.d(strQuote2, "quote(...)");
                            sb2.append(strQuote2);
                        }
                        sb2.append("$");
                        String string = sb2.toString();
                        i.d(string, "toString(...)");
                        aVar.f44338a = z.g(string);
                        linkedHashMap.put(str2, aVar);
                    }
                }
                return linkedHashMap;
        }
    }
}
