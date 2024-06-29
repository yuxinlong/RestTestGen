import json
import requests

def main():
    # 设置请求参数
    # url = "https://accounts.spotify.com/api/token"
    # headers = {"Content-Type": "application/x-www-form-urlencoded"}
    # data = {
    #     "grant_type": "client_credentials",
    #     "client_id": "70eb87ccaaae4af88c70caa4ecb6cd91",
    #     "client_secret": "76e9098cff5045a98eea88aa70ffc218"
    # }
    token = "ya29.a0AXooCgv1yJ0DaDCEKLX_jNCyqbgBWeuPt3WGKm-00wz41M66oML5dlZPGHTgSBNVhB0aauxe7m-tWTY6oT2oUCs5WHa-cYiPoyC01Tk6QqPBva1eCunpovQv1W-ET0WoGUK-rWf5ARpdUeB01_O6voBdPIryTPNeO_z2aCgYKAY0SARESFQHGX2Mijg-zLT9m9ewq4fGevbbSug0171"
    # # 发送 POST 请求
    # response = requests.post(url, headers=headers, data=data, proxies={})
    # if response.status_code == 200:
    #     # 解析 JSON 响应数据
    #     response_data = response.json()
    #
    # # 提取 access_token
    #     token = response_data.get("access_token")

    rtg_info = {
        "name": "Authorization",
        "value": "Bearer " + token,
        "in": "header",
        "duration": 3600
    }

    print(json.dumps(rtg_info))

if __name__ == "__main__":
    main()
