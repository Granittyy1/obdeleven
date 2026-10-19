package com.voltasit.obdeleven.presentation.oca;

import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.core.app.AbstractC2107w;
import org.json.JSONException;
import org.json.JSONObject;
import p255u9.C2798a;
import p255u9.E;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I8.a f32697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f32698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f32699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f32700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParseFile f32701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC2107w f32702f;

    public /* synthetic */ j(I8.a aVar, E e10, int i10, String str, ParseFile parseFile, AbstractC2107w abstractC2107w) {
        this.f32697a = aVar;
        this.f32698b = e10;
        this.f32699c = i10;
        this.f32700d = str;
        this.f32701e = parseFile;
        this.f32702f = abstractC2107w;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        I8.a aVar = this.f32697a;
        String value = this.f32700d;
        kotlin.jvm.internal.i.e(value, "$value");
        ParseFile parseFile = this.f32701e;
        C2798a c2798a = new C2798a();
        c2798a.put("app", ParseObject.createWithoutData("Applications", aVar.f3901a));
        c2798a.put("vehicle", this.f32698b);
        int i10 = this.f32699c;
        if (i10 == -4) {
            c2798a.put("status", "SOMETHING_WRONG");
        } else if (i10 == -3) {
            c2798a.put("status", "CHECK_IGNITION");
        } else if (i10 == -2) {
            c2798a.put("status", "NOT_SUPPORTED");
        } else if (i10 != -1) {
            c2798a.put("status", "VALUE: " + i10);
        } else {
            c2798a.put("status", "UNKNOWN_VALUE");
        }
        c2798a.put("value", value);
        c2798a.put("log", parseFile);
        AbstractC2107w abstractC2107w = this.f32702f;
        if (abstractC2107w != null) {
            I8.b bVar = abstractC2107w.f30177a;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("command", bVar.f3915a.a());
                jSONObject.put("data", bVar.f3916b);
                jSONObject.put("type", bVar.f3917c);
                jSONObject.put("values", bVar.f3918d);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            c2798a.put("failedCommand", jSONObject);
        }
        return c2798a.saveInBackground();
    }
}
