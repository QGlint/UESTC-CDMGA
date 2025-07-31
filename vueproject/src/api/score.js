import request from '@/utils/request'

/**
 * ģ��ɼ��ύ
 * @param {Object} handleScore - ģ��ɼ�
 * @param {Number} handleScore.course_id
 * @returns {Promise}
 */
export const Test_handleSubmitScore = (handleScore) => {
    return request({
        url: '/score/submit',
        method: 'post',
        headers : {
            "Content-Type" : 'application/json'
        },
        data: handleScore
    })
}
/**
 *
 * @param {Number} identityId
 * @param {Number} courseId
 * @returns {Promise}
 */
export const  checkSubmitted = (identityId,courseId) => {
    return request({
        url: '/score/exists',
        method: 'get',
        params: {
            identityId: identityId,
            courseId: courseId
        }
    })
}
/**
 *
 * @param {Object} handleScore - �ύ�ĳɼ���Ϣ
 * @Param {String} handleScore.course_id
 * @Param {Number} handleScore.identity_id
 * @param {String} handleScore.upload_time
 * @param {string} handleScore.image
 */
export const handleSubmitScore = (handleScore) => {
    return request({
        url: '/score/post',
        method: 'post',
        data: handleScore
    })
}
/**
 *
 * @param {Object} updateData
 * @param {Number} updateData.point
 * @param {Boolean} updateData.is_scored
 * @param {String} updateData.remark
 * @Param {String} course_id
 */
export const handleUpdateScore = (updateData,course_id) => {
    return request({
        url: `/score/update/${course_id}`,
        method: 'post',
        data: updateData
    })
}
