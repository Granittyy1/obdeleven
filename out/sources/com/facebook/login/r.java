package com.facebook.login;

import android.os.Bundle;
import androidx.fragment.app.E;
import com.facebook.appevents.ml.ModelManager;
import com.obdeleven.service.model.ControlUnit;
import com.voltasit.obdeleven.presentation.SfdViewModel;
import com.voltasit.obdeleven.presentation.controlUnit.eeprom.EepromFragment;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p033c7.C1505s;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements E, h4.g.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25167b;

    public /* synthetic */ r(Object obj) {
        this.f25167b = obj;
    }

    @Override // h4.g.a
    public void a(File file) {
        HashMap map;
        HashMap map2;
        p105i4.b bVar;
        char c10;
        int i10;
        char c11 = 4;
        int i11 = 1;
        ArrayList<ModelManager.a> arrayList = (ArrayList) this.f25167b;
        kotlin.jvm.internal.i.e(file, "file");
        HashMap map3 = p105i4.b.f36726m;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int iAvailable = fileInputStream.available();
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            byte[] bArr = new byte[iAvailable];
            dataInputStream.readFully(bArr);
            dataInputStream.close();
            if (iAvailable < 4) {
                map = null;
                break;
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, 4);
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            int i12 = byteBufferWrap.getInt();
            int i13 = i12 + 4;
            if (iAvailable >= i13) {
                JSONObject jSONObject = new JSONObject(new String(bArr, 4, i12, kotlin.text.a.f43120b));
                JSONArray jSONArrayNames = jSONObject.names();
                int length = jSONArrayNames.length();
                String[] strArr = new String[length];
                int i14 = length - 1;
                if (i14 >= 0) {
                    int i15 = 0;
                    while (true) {
                        int i16 = i15 + 1;
                        strArr[i15] = jSONArrayNames.getString(i15);
                        if (i16 > i14) {
                            break;
                        } else {
                            i15 = i16;
                        }
                    }
                }
                if (length > 1) {
                    Arrays.sort(strArr);
                }
                map = new HashMap();
                int i17 = 0;
                while (i17 < length) {
                    String str = strArr[i17];
                    i17 += i11;
                    if (str != null) {
                        JSONArray jSONArray = jSONObject.getJSONArray(str);
                        int length2 = jSONArray.length();
                        int[] iArr = new int[length2];
                        int i18 = length2 - 1;
                        if (i18 >= 0) {
                            int i19 = i11;
                            int i20 = 0;
                            while (true) {
                                int i21 = i20 + 1;
                                int i22 = jSONArray.getInt(i20);
                                iArr[i20] = i22;
                                i19 *= i22;
                                if (i21 > i18) {
                                    break;
                                } else {
                                    i20 = i21;
                                }
                            }
                            i10 = i19;
                            c10 = 4;
                        } else {
                            c10 = c11;
                            i10 = i11;
                        }
                        int i23 = i10 * 4;
                        int i24 = i13 + i23;
                        if (i24 <= iAvailable) {
                            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, i13, i23);
                            byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                            p105i4.a aVar = new p105i4.a(iArr);
                            byteBufferWrap2.asFloatBuffer().get(aVar.f36725c, 0, i10);
                            map.put(str, aVar);
                            c11 = c10;
                            i13 = i24;
                            i11 = 1;
                        }
                    }
                }
            }
            map = null;
            break;
        } catch (Exception unused) {
        }
        if (map == null) {
            map2 = null;
            break;
        }
        map2 = new HashMap();
        HashMap map4 = p105i4.b.f36726m;
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            if (map4.containsKey(entry.getKey()) && (str2 = (String) map4.get(entry.getKey())) == null) {
                map2 = null;
                break;
            }
            map2.put(str2, entry.getValue());
        }
        if (map2 == null) {
            bVar = null;
        } else {
            try {
                bVar = new p105i4.b(map2);
            } catch (Exception unused2) {
                bVar = null;
            }
        }
        if (bVar != null) {
            for (ModelManager.a aVar2 : arrayList) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(aVar2.f24951a);
                sb2.append('_');
                String strC = p005a4.q.c(sb2, aVar2.f24954d, "_rule");
                C1505s c1505s = new C1505s(aVar2, bVar);
                File file2 = new File(P3.d.j(), strC);
                String str3 = aVar2.f24953c;
                if (str3 == null || file2.exists()) {
                    c1505s.a(file2);
                } else {
                    new p093h4.g(str3, file2, c1505s).execute(new String[0]);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, xa.g] */
    @Override // androidx.fragment.app.E
    public void h(Bundle bundle, String str) {
        EepromFragment this$0 = (EepromFragment) this.f25167b;
        kotlin.jvm.internal.i.e(this$0, "this$0");
        SfdViewModel sfdViewModel = (SfdViewModel) this$0.f31553z.getValue();
        ControlUnit controlUnit = this$0.f31540m;
        kotlin.jvm.internal.i.b(controlUnit);
        String objectId = controlUnit.f29320b.getControlUnitBase().getObjectId();
        kotlin.jvm.internal.i.d(objectId, "getObjectId(...)");
        ControlUnit controlUnit2 = this$0.f31540m;
        kotlin.jvm.internal.i.b(controlUnit2);
        sfdViewModel.d(objectId, controlUnit2.n().shortValue());
    }
}
