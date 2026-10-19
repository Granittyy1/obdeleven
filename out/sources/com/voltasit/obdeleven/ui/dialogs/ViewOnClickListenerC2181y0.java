package com.voltasit.obdeleven.ui.dialogs;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import com.parse.ParseException;
import com.parse.ParseFile;
import com.parse.ParseUser;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.adapter.pro.LabelItemAdapter;
import io.intercom.android.sdk.models.Participant;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.concurrent.Callable;
import p255u9.j;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.y0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC2181y0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f34059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f34060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f34061d;

    public /* synthetic */ ViewOnClickListenerC2181y0(Object obj, int i10, Object obj2) {
        this.f34059b = i10;
        this.f34060c = obj;
        this.f34061d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = 4;
        Object obj = this.f34061d;
        Object obj2 = this.f34060c;
        switch (this.f34059b) {
            case 0:
                C2183z0 c2183z0 = (C2183z0) obj2;
                TextInputLayout textInputLayout = (TextInputLayout) obj;
                if (c2183z0.f34066t.getText().toString().isEmpty()) {
                    textInputLayout.setError(c2183z0.getString(R.string.dialog_error_description));
                    break;
                } else if (c2183z0.getContext() != null) {
                    if (T4.D.f5841b == null) {
                        T4.D.f5841b = new T4.D();
                    }
                    T4.D d10 = T4.D.f5841b;
                    Context context = c2183z0.getContext();
                    androidx.fragment.app.y yVar = c2183z0.f32261r;
                    C2177w0 c2177w0 = (C2177w0) d10.f5842a;
                    if (c2177w0 != null) {
                        if (c2177w0 != null) {
                            c2177w0.o();
                            d10.f5842a = null;
                        }
                        O.e.D("Application", "Showing preloader without properly closing last one");
                    }
                    if (yVar != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("key_message", (String) context.getText(R.string.common_loading));
                        C2177w0 c2177w1 = new C2177w0();
                        c2177w1.setArguments(bundle);
                        c2177w1.f32261r = yVar;
                        d10.f5842a = c2177w1;
                        c2177w1.A();
                    }
                    Task.callInBackground(new D7.b(2, c2183z0)).continueWith(new com.voltasit.obdeleven.core.app.p0(c2183z0, 3, textInputLayout), Task.UI_THREAD_EXECUTOR);
                    break;
                }
                break;
            case 1:
                final p097h9.r rVar = (p097h9.r) obj2;
                if (rVar.f36233s == null) {
                    MainActivity mainActivityQ = rVar.q();
                    p220r9.P.a(mainActivityQ, mainActivityQ.getString(R.string.view_manual_editor_unable_to_determine_vehicle_base));
                } else if (rVar.f36227m.getText().toString().isEmpty()) {
                    MainActivity mainActivityQ2 = rVar.q();
                    p220r9.P.a(mainActivityQ2, mainActivityQ2.getString(R.string.view_manual_editor_title_is_empty));
                } else if (rVar.f36235u == null && rVar.f36229o.getParseFile("picture") == null) {
                    MainActivity mainActivityQ3 = rVar.q();
                    p220r9.P.a(mainActivityQ3, mainActivityQ3.getString(R.string.view_manual_editor_no_cover_photo));
                } else if (rVar.f36230p.f36240d == null) {
                    MainActivity mainActivityQ4 = rVar.q();
                    p220r9.P.a(mainActivityQ4, mainActivityQ4.getString(R.string.view_manual_language_not_selected));
                } else {
                    p097h9.j jVar = rVar.f36231q;
                    if (!jVar.f36795b.isEmpty()) {
                        for (T t8 : jVar.f36795b) {
                            if (!TextUtils.isEmpty(t8.getString("description")) || t8.getParseFile("picture") != null) {
                            }
                        }
                        if (com.voltasit.obdeleven.domain.usecases.device.u.k((Context) obj)) {
                            C2134a0.b(rVar.getContext(), R.string.common_loading);
                            rVar.f36229o.put("name", rVar.f36227m.getText().toString());
                            rVar.f36229o.put("lang", rVar.f36230p.f36240d.c());
                            rVar.f36229o.put("production", Boolean.valueOf(rVar.f36228n.isChecked()));
                            p255u9.i iVar = rVar.f36229o;
                            int i11 = p255u9.z.f47484b;
                            iVar.put(Participant.USER_TYPE, (p255u9.z) ParseUser.getCurrentUser());
                            rVar.f36229o.put("vehicleBase", rVar.f36233s);
                            p255u9.i iVar2 = rVar.f36229o;
                            iVar2.put("usage", Integer.valueOf(iVar2.getInt("usage")));
                            Task.callInBackground(new Callable() { // from class: h9.o
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    r rVar2 = rVar;
                                    rVar2.getClass();
                                    try {
                                        if (rVar2.f36235u != null) {
                                            Bitmap bitmap = rVar2.f36235u;
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                                            ParseFile parseFile = new ParseFile("file.jpg", byteArrayOutputStream.toByteArray());
                                            parseFile.save();
                                            rVar2.f36229o.put("picture", parseFile);
                                        }
                                        rVar2.f36229o.save();
                                        for (T t10 : rVar2.f36231q.f36795b) {
                                            t10.put("manual", rVar2.f36229o);
                                            t10.save();
                                        }
                                        Iterator it = rVar2.f36231q.f36206h.iterator();
                                        while (it.hasNext()) {
                                            ((j) it.next()).delete();
                                        }
                                        return null;
                                    } catch (ParseException e10) {
                                        return e10;
                                    }
                                }
                            }).continueWith(new com.voltasit.obdeleven.core.app.B(i10, rVar), Task.UI_THREAD_EXECUTOR);
                        } else {
                            MainActivity mainActivityQ5 = rVar.q();
                            p220r9.P.a(mainActivityQ5, mainActivityQ5.getString(R.string.common_network_connection_required));
                        }
                    }
                    MainActivity mainActivityQ6 = rVar.q();
                    p220r9.P.a(mainActivityQ6, mainActivityQ6.getString(R.string.view_manual_editor_all_manual_steps_must_be_filled));
                }
                break;
            default:
                LabelItemAdapter.c cVar = (LabelItemAdapter.c) obj2;
                cVar.getClass();
                p255u9.u uVar = (p255u9.u) obj;
                uVar.increment("rating", -1);
                int i12 = p255u9.z.f47484b;
                uVar.getRelation("usersRated").add((p255u9.z) ParseUser.getCurrentUser());
                uVar.f47481b = true;
                uVar.saveEventually();
                cVar.f33724d.setVisibility(4);
                cVar.f33722b.setVisibility(4);
                break;
        }
    }
}
