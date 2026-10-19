package D7;

import com.parse.ControlUnitDB;
import com.parse.ParseException;
import com.parse.ParseFile;
import com.parse.ParseUser;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.ui.dialogs.C2183z0;
import io.intercom.android.sdk.models.Participant;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p255u9.z;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2826c;

    public /* synthetic */ b(int i10, Object obj) {
        this.f2825b = i10;
        this.f2826c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws ParseException, IOException {
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th;
        com.google.firebase.remoteconfig.internal.b bVarA = null;
        switch (this.f2825b) {
            case 0:
                o oVar = (o) this.f2826c;
                synchronized (oVar) {
                    try {
                        try {
                            fileInputStreamOpenFileInput = oVar.f2869a.openFileInput(oVar.f2870b);
                            try {
                                int iAvailable = fileInputStreamOpenFileInput.available();
                                byte[] bArr = new byte[iAvailable];
                                fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                                bVarA = com.google.firebase.remoteconfig.internal.b.a(new JSONObject(new String(bArr, "UTF-8")));
                                fileInputStreamOpenFileInput.close();
                            } catch (FileNotFoundException | JSONException unused) {
                                if (fileInputStreamOpenFileInput != null) {
                                    fileInputStreamOpenFileInput.close();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (fileInputStreamOpenFileInput != null) {
                                    fileInputStreamOpenFileInput.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    } catch (FileNotFoundException | JSONException unused2) {
                        fileInputStreamOpenFileInput = null;
                    } catch (Throwable th4) {
                        fileInputStreamOpenFileInput = null;
                        th = th4;
                    }
                }
                return bVarA;
            case 1:
                return (ControlUnitDB) ((com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h) this.f2826c).f31925q.f29320b.fetch();
            default:
                C2183z0 c2183z0 = (C2183z0) this.f2826c;
                c2183z0.getClass();
                P8.b bVar = Application.f29635c;
                kotlin.jvm.internal.i.b(bVar);
                File file = bVar.f4958c;
                kotlin.jvm.internal.i.d(file, "getLogFile(...)");
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr2 = new byte[fileInputStream.available()];
                fileInputStream.read(bArr2);
                fileInputStream.close();
                ParseFile parseFile = new ParseFile("log.txt", bArr2);
                parseFile.save();
                p255u9.p pVar = new p255u9.p();
                int i10 = z.f47484b;
                if (((z) ParseUser.getCurrentUser()) != null) {
                    pVar.put(Participant.USER_TYPE, (z) ParseUser.getCurrentUser());
                }
                pVar.put("description", c2183z0.f34066t.getText().toString() + " Version: 0.107.1-10800");
                pVar.put("log", parseFile);
                pVar.save();
                return null;
        }
    }
}
