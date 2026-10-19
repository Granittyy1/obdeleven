package com.voltasit.obdeleven.presentation.dialogs.backup;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.parse.ParseException;
import com.parse.ParseFile;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.i;
import p255u9.C2800c;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f32184d;

    public /* synthetic */ c(Object obj, int i10, Object obj2) {
        this.f32182b = i10;
        this.f32183c = obj;
        this.f32184d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f32182b) {
            case 0:
                MultiBackupDialog this$0 = (MultiBackupDialog) this.f32184d;
                i.e(this$0, "this$0");
                Exception exc = (Exception) this.f32183c;
                if (exc == null) {
                    this$0.E(2);
                    return null;
                }
                O.e.m(exc);
                this$0.E(4);
                return null;
            default:
                C2800c.a aVar = (C2800c.a) this.f32184d;
                C2800c c2800c = (C2800c) this.f32183c;
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream);
                        Gson gson = new Gson();
                        try {
                            gson.j(aVar, aVar.getClass(), gson.g(outputStreamWriter));
                            outputStreamWriter.flush();
                            outputStreamWriter.close();
                            ParseFile parseFile = new ParseFile("data.json", byteArrayOutputStream.toByteArray());
                            parseFile.save();
                            c2800c.put("data", parseFile);
                            return Boolean.TRUE;
                        } catch (IOException e10) {
                            throw new JsonIOException(e10);
                        }
                    } catch (IOException e11) {
                        e = e11;
                        e.printStackTrace();
                        return Boolean.FALSE;
                    }
                } catch (ParseException e12) {
                    e = e12;
                    e.printStackTrace();
                    return Boolean.FALSE;
                }
        }
    }
}
