package p097h9;

import com.parse.ParseException;
import com.parse.ParseFile;
import com.parse.SaveCallback;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import java.io.File;
import p220r9.y;
import p255u9.j;

/* JADX INFO: compiled from: ManualEditorAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements y.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f36203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f36204b;

    public i(j jVar, j jVar2) {
        this.f36204b = jVar;
        this.f36203a = jVar2;
    }

    @Override // r9.y.a
    public final void a() {
        C2134a0.a();
    }

    @Override // r9.y.a
    public final void b(File file) {
        final ParseFile parseFile = new ParseFile(file);
        final j jVar = this.f36203a;
        parseFile.saveInBackground(new SaveCallback() { // from class: h9.h
            @Override // com.parse.ParseCallback1
            public final void done(Throwable th) {
                ParseException parseException = (ParseException) th;
                i iVar = this.f36200b;
                iVar.getClass();
                if (parseException == null) {
                    jVar.put("picture", parseFile);
                    j jVar2 = iVar.f36204b;
                    jVar2.notifyDataSetChanged();
                    jVar2.f36207i = true;
                }
                C2134a0.a();
            }
        });
    }
}
