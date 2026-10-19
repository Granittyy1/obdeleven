package com.braze.models.inappmessage;

import bo.app.c2;
import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.enums.inappmessage.MessageType;
import com.braze.support.c;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class InAppMessageModal extends InAppMessageImmersiveBase {
    public InAppMessageModal() {
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public MessageType getMessageType() {
        return MessageType.MODAL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageModal(JSONObject jsonObject, c2 brazeManager) {
        super(jsonObject, brazeManager);
        i.e(jsonObject, "jsonObject");
        i.e(brazeManager, "brazeManager");
        CropType cropType = getImageStyle() == ImageStyle.GRAPHIC ? CropType.CENTER_CROP : CropType.FIT_CENTER;
        try {
            c cVar = c.f24371a;
            String string = jsonObject.getString(InAppMessageBase.CROP_TYPE);
            i.d(string, "jsonObject.getString(key)");
            Locale US = Locale.US;
            i.d(US, "US");
            String upperCase = string.toUpperCase(US);
            i.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
            for (CropType cropType2 : CropType.values()) {
                if (i.a(cropType2.name(), upperCase)) {
                    cropType = cropType2;
                    setCropType(cropType);
                    return;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception unused) {
        }
    }

    @Override // com.braze.models.inappmessage.InAppMessageImmersiveBase, com.braze.models.inappmessage.InAppMessageWithImageBase, com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        JSONObject jsonObject = getJsonObject();
        if (jsonObject != null) {
            return jsonObject;
        }
        JSONObject jSONObjectForJsonPut = super.forJsonPut();
        try {
            jSONObjectForJsonPut.put("type", getMessageType().name());
        } catch (JSONException unused) {
        }
        return jSONObjectForJsonPut;
    }
}
