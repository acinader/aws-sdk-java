/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cognitosync.AmazonCognitoSync#setIdentityPoolConfiguration(SetIdentityPoolConfigurationRequest) SetIdentityPoolConfiguration operation}.
 * <p>
 * Sets the necessary configuration for push sync.
 * </p>
 *
 * @see com.amazonaws.services.cognitosync.AmazonCognitoSync#setIdentityPoolConfiguration(SetIdentityPoolConfigurationRequest)
 */
public class SetIdentityPoolConfigurationRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. This is the ID of the pool to modify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityPoolId;

    /**
     * Configuration options to be applied to the identity pool.
     */
    private PushSync pushSync;

    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. This is the ID of the pool to modify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. This is the ID of the pool to modify.
     */
    public String getIdentityPoolId() {
        return identityPoolId;
    }
    
    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. This is the ID of the pool to modify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. This is the ID of the pool to modify.
     */
    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }
    
    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. This is the ID of the pool to modify.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. This is the ID of the pool to modify.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SetIdentityPoolConfigurationRequest withIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
        return this;
    }

    /**
     * Configuration options to be applied to the identity pool.
     *
     * @return Configuration options to be applied to the identity pool.
     */
    public PushSync getPushSync() {
        return pushSync;
    }
    
    /**
     * Configuration options to be applied to the identity pool.
     *
     * @param pushSync Configuration options to be applied to the identity pool.
     */
    public void setPushSync(PushSync pushSync) {
        this.pushSync = pushSync;
    }
    
    /**
     * Configuration options to be applied to the identity pool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pushSync Configuration options to be applied to the identity pool.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SetIdentityPoolConfigurationRequest withPushSync(PushSync pushSync) {
        this.pushSync = pushSync;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIdentityPoolId() != null) sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        if (getPushSync() != null) sb.append("PushSync: " + getPushSync() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode()); 
        hashCode = prime * hashCode + ((getPushSync() == null) ? 0 : getPushSync().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SetIdentityPoolConfigurationRequest == false) return false;
        SetIdentityPoolConfigurationRequest other = (SetIdentityPoolConfigurationRequest)obj;
        
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null) return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false) return false; 
        if (other.getPushSync() == null ^ this.getPushSync() == null) return false;
        if (other.getPushSync() != null && other.getPushSync().equals(this.getPushSync()) == false) return false; 
        return true;
    }
    
}
    