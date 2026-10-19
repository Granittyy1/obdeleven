package com.voltasit.obdeleven.data.providers;

import A1.C0576k;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.Log;
import bo.app.F0;
import com.google.firebase.concurrent.FirebaseExecutors;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.voltasit.obdeleven.R;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: RemoteConfigCoreProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class RemoteConfigCoreProviderImpl implements J8.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f30247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C7.i f30248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C7.j f30249c;

    /* JADX INFO: compiled from: RemoteConfigCoreProviderImpl.kt */
    public static final class a implements C7.c {
        public a() {
        }

        @Override // C7.c
        public final void a(FirebaseRemoteConfigException firebaseRemoteConfigException) {
            RemoteConfigCoreProviderImpl remoteConfigCoreProviderImpl = RemoteConfigCoreProviderImpl.this;
            remoteConfigCoreProviderImpl.f30247a.b("RemoteConfigCoreProviderImpl", "Can't get remote firebase config");
            remoteConfigCoreProviderImpl.f30247a.d(firebaseRemoteConfigException, false);
        }

        @Override // C7.c
        public final void b(C7.a aVar) {
            RemoteConfigCoreProviderImpl remoteConfigCoreProviderImpl = RemoteConfigCoreProviderImpl.this;
            remoteConfigCoreProviderImpl.f30247a.f("RemoteConfigCoreProviderImpl", "onUpdate()");
            C7.i iVar = remoteConfigCoreProviderImpl.f30248b;
            p191p5.g<com.google.firebase.remoteconfig.internal.b> gVarB = iVar.f2436d.b();
            p191p5.g<com.google.firebase.remoteconfig.internal.b> gVarB2 = iVar.f2437e.b();
            p191p5.j.g(gVarB, gVarB2).i(iVar.f2435c, new C7.e(iVar, gVarB, gVarB2)).c(new F0(2, remoteConfigCoreProviderImpl));
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    public RemoteConfigCoreProviderImpl(J8.p pVar) {
        byte b10;
        this.f30247a = pVar;
        C7.i iVarB = ((C7.o) p144l6.e.c().b(C7.o.class)).b("firebase");
        kotlin.jvm.internal.i.d(iVarB, "getInstance()");
        this.f30248b = iVarB;
        RemoteConfigCoreProviderImpl$configSettings$1 init = RemoteConfigCoreProviderImpl$configSettings$1.f30251h;
        kotlin.jvm.internal.i.e(init, "init");
        C7.j.a aVar = new C7.j.a();
        init.invoke(aVar);
        this.f30249c = new C7.j(aVar);
        Context context = iVarB.f2433a;
        HashMap map = new HashMap();
        try {
            Resources resources = context.getResources();
            if (resources == null) {
                Log.e("FirebaseRemoteConfig", "Could not find the resources of the current context while trying to set defaults from an XML.");
            } else {
                XmlResourceParser xml = resources.getXml(R.xml.remote_config_defaults);
                String name = null;
                String text = null;
                String text2 = null;
                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                    if (eventType == 2) {
                        name = xml.getName();
                    } else if (eventType == 3) {
                        if (xml.getName().equals("entry")) {
                            if (text != null && text2 != null) {
                                map.put(text, text2);
                            }
                            text = null;
                            text2 = null;
                        }
                        name = null;
                    } else if (eventType == 4 && name != null) {
                        int iHashCode = name.hashCode();
                        if (iHashCode != 106079) {
                            if (iHashCode == 111972721 && name.equals("value")) {
                                b10 = 1;
                            } else {
                                b10 = -1;
                            }
                        } else if (name.equals("key")) {
                            b10 = 0;
                        } else {
                            b10 = -1;
                        }
                        if (b10 == 0) {
                            text = xml.getText();
                        } else if (b10 == 1) {
                            text2 = xml.getText();
                        }
                    }
                }
            }
        } catch (IOException e10) {
            e = e10;
            Log.e("FirebaseRemoteConfig", "Encountered an error while parsing the defaults XML file.", e);
        } catch (XmlPullParserException e11) {
            e = e11;
            Log.e("FirebaseRemoteConfig", "Encountered an error while parsing the defaults XML file.", e);
        }
        try {
            com.google.firebase.remoteconfig.internal.b.a aVarC = com.google.firebase.remoteconfig.internal.b.c();
            aVarC.f28592a = new JSONObject(map);
            iVarB.f2438f.d(aVarC.a()).p(FirebaseExecutors.a(), new C0576k(1));
        } catch (JSONException e12) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e12);
            p191p5.j.e(null);
        }
        final C7.i iVar = this.f30248b;
        final C7.j jVar = this.f30249c;
        iVar.getClass();
        p191p5.j.c(new Callable() { // from class: C7.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                i iVar2 = iVar;
                j jVar2 = jVar;
                com.google.firebase.remoteconfig.internal.c cVar = iVar2.f2441i;
                synchronized (cVar.f28601b) {
                    cVar.f28600a.edit().putLong("fetch_timeout_in_seconds", jVar2.f2444a).putLong("minimum_fetch_interval_in_seconds", jVar2.f2445b).commit();
                }
                return null;
            }
        }, iVar.f2435c);
        C7.i iVar2 = this.f30248b;
        a aVar2 = new a();
        D7.l lVar = iVar2.f2442k;
        synchronized (lVar) {
            ((LinkedHashSet) lVar.f2860a).add(aVar2);
            lVar.a();
        }
        this.f30248b.a().c(new A4.b(this));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0037  */
    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // J8.t
    public final boolean a(String str) {
        String strC;
        D7.k kVar = this.f30248b.f2440h;
        D7.e eVar = kVar.f2858c;
        String strC2 = D7.k.c(eVar, str);
        Pattern pattern = D7.k.f2855f;
        Pattern pattern2 = D7.k.f2854e;
        if (strC2 == null) {
            strC = D7.k.c(kVar.f2859d, str);
            if (strC != null) {
                if (pattern2.matcher(strC).matches()) {
                    return true;
                }
                pattern.matcher(strC).matches();
            }
        } else {
            if (pattern2.matcher(strC2).matches()) {
                kVar.a(str, eVar.c());
                return true;
            }
            if (pattern.matcher(strC2).matches()) {
                kVar.a(str, eVar.c());
            } else {
                strC = D7.k.c(kVar.f2859d, str);
                if (strC != null) {
                    if (pattern2.matcher(strC).matches()) {
                        return true;
                    }
                    pattern.matcher(strC).matches();
                }
            }
        }
        return false;
    }

    @Override // J8.t
    public final String b(String str) {
        D7.k kVar = this.f30248b.f2440h;
        D7.e eVar = kVar.f2858c;
        String strC = D7.k.c(eVar, str);
        if (strC != null) {
            kVar.a(str, eVar.c());
            return strC;
        }
        String strC2 = D7.k.c(kVar.f2859d, str);
        return strC2 != null ? strC2 : "";
    }
}
