import pandas as pd

def getDataframeSize(players: pd.DataFrame) -> List[int]:
    result=list(players.shape)
    return result
