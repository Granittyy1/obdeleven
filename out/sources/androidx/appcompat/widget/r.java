package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C1291f;

/* JADX INFO: compiled from: AppCompatReceiveContentHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        C1291f.b aVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                aVar = new C1291f.a(clipData, 3);
            } else {
                C1291f.c cVar = new C1291f.c();
                cVar.f16921a = clipData;
                cVar.f16922b = 3;
                aVar = cVar;
            }
            androidx.core.view.O.j(textView, aVar.a());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        C1291f.b aVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            aVar = new C1291f.a(clipData, 3);
        } else {
            C1291f.c cVar = new C1291f.c();
            cVar.f16921a = clipData;
            cVar.f16922b = 3;
            aVar = cVar;
        }
        androidx.core.view.O.j(view, aVar.a());
        return true;
    }
}
